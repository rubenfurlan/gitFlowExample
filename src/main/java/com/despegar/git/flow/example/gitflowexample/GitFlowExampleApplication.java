package com.despegar.git.flow.example.gitflowexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitFlowExampleApplication {

    // -> levanto aca: http://localhost:8080/
    //feaure2
    //feature_3
    //feature_4
    //feature_5
    //feature_6
    //feature sin las opciones
    //feature CON las opciones


    public static void main(String[] args) {
        SpringApplication.run(GitFlowExampleApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    //Esto es el hf 0.0.0.1
}
