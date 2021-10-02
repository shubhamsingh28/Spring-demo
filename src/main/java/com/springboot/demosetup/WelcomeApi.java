package com.springboot.demosetup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApi {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello world!";
    }
}
