package com.gdsc.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//서버 환경 테스트 할 겸 기본 Hello Spring를 출력해보았습니다.
@RestController("/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
