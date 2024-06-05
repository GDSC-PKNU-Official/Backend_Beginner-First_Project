package com.sample.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// hello 페이지에 대한 Controller 입니다.
@Controller
public class HelloController {
    // hello 페이지로 연결
    @GetMapping("/hello")
    public String hello() {
        return "redirect:/hello.html";
    }

    // 메인(index) 페이지로 연결
    @PostMapping("/home")
    public String helloPost() {
        return "redirect:/";
    }
}
