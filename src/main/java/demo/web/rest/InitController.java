package demo.web.rest;

import demo.domain.process.variables.order.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    @GetMapping("/hello")
    public String hello(){
        return "HELLO";
    }

    @PostMapping("/init")
    public void init(@RequestBody Order order){
        System.out.println(order);
        // start new processId
        // redirect to
    }
}
