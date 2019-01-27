package demo.domain.process.task.user.switchstep.controller;

import demo.domain.process.task.user.switchstep.message.SwitchStepMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class SwitchStepController {

    @MessageMapping("/process/{processId}")
    @SendTo("/process/{processId}")
    public SwitchStepMessage send(@DestinationVariable String processId, final SwitchStepMessage message){
        return message;
    }
}
