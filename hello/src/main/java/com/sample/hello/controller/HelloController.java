package com.sample.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "redirect:/hello.html";
    }

    @PostMapping("/home")
    public String helloPost() {
        return "redirect:/index.html";
    }
}
