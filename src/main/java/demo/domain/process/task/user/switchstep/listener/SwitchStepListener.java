package demo.domain.process.task.user.switchstep.listener;

import demo.domain.process.task.user.switchstep.service.SwitchStepService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.camunda.bpm.engine.impl.bpmn.delegate.ExecutionListenerInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SwitchStepListener implements ExecutionListener {

    @Autowired
    private SwitchStepService switchStepService;

    public void notify(final DelegateExecution execution){
        System.out.println("Init task: " + execution.getCurrentActivityId());
        switchStepService.send(execution);
    }
}
