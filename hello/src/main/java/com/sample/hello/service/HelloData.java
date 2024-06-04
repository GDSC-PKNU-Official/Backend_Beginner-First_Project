package com.sample.hello.service;

import org.springframework.stereotype.Service;

@Service
public class HelloData {
    public String sayHello() {
        return "Hello World";
    }
}
