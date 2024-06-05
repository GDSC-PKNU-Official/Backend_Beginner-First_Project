package com.sample.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

// 단순 메인 페이지 지정 Controller 입니다
@Controller
public class HomeController {

    //index로 연결
    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
    @PostMapping("/")
    public String homePost() {
        return "redirect:/index.html";
    }
}
