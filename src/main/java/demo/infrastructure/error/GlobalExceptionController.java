package demo.infrastructure.error;

import demo.infrastructure.error.camunda.web.CannotSendSwitchStepMessageException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler(CannotSendSwitchStepMessageException.class)
    public ErrorDetail handleNotFoundException(CannotSendSwitchStepMessageException ex) {
        return new ErrorDetail(ex.getMessage());
    }
}
