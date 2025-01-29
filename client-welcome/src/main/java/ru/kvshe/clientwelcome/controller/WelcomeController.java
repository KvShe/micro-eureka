package ru.kvshe.clientwelcome.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {
    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping
    public String welcome() {
        return "Welcome! " + instanceId;
    }
}
