package demo.web.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticContentController {

   @GetMapping("/app/welcome/scripts/config.js")
    public String configScript(){
        return "config.js";
    }

    @GetMapping("/app/welcome/requestInterceptor.js")
    public String requestScript(){
        return "requestInterceptor.js";
    }

}
