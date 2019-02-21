package demo.domain.process.task.service.hello;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class SayHelloDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution){
        System.out.println("Execute: " + delegateExecution.getCurrentActivityName());
    }
}