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


    public static void main(String[] args) {
        SpringApplication.run(GitFlowExampleApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

}
