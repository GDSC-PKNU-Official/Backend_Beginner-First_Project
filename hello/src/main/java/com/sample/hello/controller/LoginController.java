package com.sample.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 간단한 login을 다루는 Controller 입니다.
@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginPage() {
        return "redirect:/login-form.html";
    }

    @PostMapping("/login")
    public String loginProcess(
            @RequestParam String id,
            @RequestParam String password,
            @RequestParam String name,
            Model model
    ) {
        if(id.equals(password)) {
            model.addAttribute("loginId", id);
            model.addAttribute("name", name);
        }
        return "login-result";
    }
}
