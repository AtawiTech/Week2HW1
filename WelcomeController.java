package com.example.week2hw1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/Hey")
    public String hey(){
        return "Hey from spring";
    }
    @GetMapping("/Bye")
    public String bye(){
        return "Bye Bye";
    }
    @GetMapping("/check/status")
    public String Status(){
        return "Everything is OK";
    }
    @GetMapping("/health")
    public String Health(){
        return "Server health is up and running";
    }
}
