package com.together.template;

import lombok.Getter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(value = "/helloObject", produces = "application/json")
    public HelloObject helloObject(){
        return new HelloObject();
    }

}
