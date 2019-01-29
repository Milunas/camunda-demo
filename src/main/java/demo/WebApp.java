package demo;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableProcessApplication("mySimpleApplication")
@EnableScheduling
@ServletComponentScan
@EnableWebMvc
public class WebApp {

    public static void main(String... args){
        SpringApplication.run(WebApp.class, args);
    }

}
