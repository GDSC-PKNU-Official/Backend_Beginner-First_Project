package com.sample.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
    @PostMapping("/")
    public String homePost() {
        return "redirect:/index.html";
    }
}
