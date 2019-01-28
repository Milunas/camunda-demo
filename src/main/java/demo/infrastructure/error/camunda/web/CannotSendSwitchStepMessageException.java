package demo.infrastructure.error.camunda.web;


public class CannotSendSwitchStepMessageException extends RuntimeException {
    public CannotSendSwitchStepMessageException(String msg){
        super(msg);
    }
}
