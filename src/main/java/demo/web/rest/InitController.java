package demo.web.rest;

import demo.domain.process.variables.order.Order;
import demo.infrastructure.error.camunda.web.CannotSendSwitchStepMessageException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/hello")
    public String hello(){
        logger.debug("HELLO?");
        logger.info("HELLO");
        logger.warn("HELLO!");
        return "HELLO";
    }

    @GetMapping("/test")
    public String test(){
        logger.error("ERROR");
        throw new CannotSendSwitchStepMessageException("CANNOT, JUST CANNOT");
    }

    @PostMapping("/init")
    public void init(@RequestBody Order order){
        System.out.println(order);
        // start new processId
        // redirect to
    }
}
