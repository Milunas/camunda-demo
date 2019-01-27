package demo.domain.process.task.user.switchstep.listener;

import demo.domain.process.task.user.switchstep.service.SwitchStepService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SwitchStepListener {

    @Autowired
    private SwitchStepService switchStepService;

    @EventListener
    public void notify(final DelegateExecution execution){
        System.out.println("Init task: " + execution.getCurrentActivityId());
        switchStepService.send(execution);
    }
}
