package demo.web.socket.chat.controller;

import demo.web.socket.chat.model.message.Message;
import demo.web.socket.chat.model.message.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

// https://www.baeldung.com/websockets-spring
// https://www.baeldung.com/spring-websockets-sendtouser
@Controller
public class WebSocketController {
    @MessageMapping("/chat")
    @SendTo("/topic/messages") // all subscibers to topic/message will receive this
    public OutputMessage send(final Message message) throws Exception {
        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }
}
