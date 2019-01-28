package demo.web.config;

import demo.infrastructure.error.GlobalExceptionController;
import demo.web.rest.InitController;
import demo.web.rest.PaymentRestController;
import demo.web.socket.config.WebSocketConfig;
import demo.web.socket.chat.controller.WebSocketController;
import org.springframework.stereotype.Component;
import org.camunda.bpm.spring.boot.starter.rest.CamundaJerseyResourceConfig;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/rest")
public class AdditionalResourceRegister extends CamundaJerseyResourceConfig{
    @Override
    protected void registerAdditionalResources() {
        register(PaymentRestController.class);
        register(InitController.class);
        register(WebSocketController.class);
        register(WebSocketConfig.class);
        register(GlobalExceptionController.class);
    }
}
