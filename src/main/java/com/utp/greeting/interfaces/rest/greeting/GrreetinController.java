package com.utp.greeting.interfaces.rest.greeting;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GrreetinController {


    @GetMapping
    public String greeting(@RequestParam(defaultValue = "World") String name) {
        return  "Hello Halloween" + name + "!";
    }
}
