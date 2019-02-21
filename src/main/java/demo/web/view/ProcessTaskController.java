package demo.web.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ProcessTaskController {

    @GetMapping("/start")
    public String startHtml(){
        return "start.html";
    }

    @GetMapping("/data")
    public String dataHtml(){
        return "data.html";
    }

    @GetMapping("/finish")
    public String finishHtml(){
        return "finish.html";
    }

    @GetMapping("/js/sockjs-0.3.4.js")
    public String sockJs(){
        return "sockjs-0.3.4.js";
    }

    @GetMapping("/js/stomp.js")
    public String stompJs(){
        return "stomp.js";
    }
}
