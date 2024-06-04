package com.sample.hello.controller;

import com.sample.hello.service.HelloData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @Autowired
    private HelloData hellodata;

    @GetMapping("/hello")
    public String hello() {
        return "redirect:/hello.html";
    }

    @PostMapping("/hello")
    public String helloPost() {
        return "redirect:/";
    }
}
