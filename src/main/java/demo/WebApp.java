package demo;

import org.apache.ibatis.logging.LogFactory;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableProcessApplication("mySimpleApplication")
@EnableScheduling
@ServletComponentScan
public class WebApp {

    @Autowired
    private RuntimeService runtimeService;

    public static void main(String... args){
        SpringApplication.run(WebApp.class, args);
    }

}
