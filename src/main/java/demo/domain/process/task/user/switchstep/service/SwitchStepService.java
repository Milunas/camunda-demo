package demo.domain.process.task.user.switchstep.service;

import demo.domain.process.task.user.switchstep.message.SwitchStepMessage;
import demo.infrastructure.error.camunda.web.CannotSendSwitchStepMessageException;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class SwitchStepService {

    private SimpMessagingTemplate template;
    private final static Logger LOGGER = Logger.getLogger(SwitchStepService.class.getName());

    public SwitchStepService(SimpMessagingTemplate template){
        this.template = template;
    }

    public void send(DelegateExecution execution) {
        String processInstanceId = execution.getProcessInstanceId();
        String currentActivityId = execution.getCurrentActivityId();
        SwitchStepMessage message = create(currentActivityId);
        trySend(processInstanceId, message);
    }

    private void trySend(String processInstanceId, SwitchStepMessage message){
        try {
            template.convertAndSend("/process/" + processInstanceId, message);
        }
        catch (Exception ex){
            throw new CannotSendSwitchStepMessageException("???");
        }
    }

    private SwitchStepMessage create(String currentActivityId){
        LOGGER.info(currentActivityId);
        return new SwitchStepMessage();
    }
}
