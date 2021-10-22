package com.taco.taco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TacoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoApplication.class, args);
    }

    @GetMapping("/message")
    public String getMessage(){
        return "Congrats on first deploy on azure";
    }
}
