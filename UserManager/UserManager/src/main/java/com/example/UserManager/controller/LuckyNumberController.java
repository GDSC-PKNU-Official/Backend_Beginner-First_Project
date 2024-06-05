package com.example.UserManager.controller;

import com.example.UserManager.model.LuckyNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/lucky")
public class LuckyNumberController {

    @GetMapping
    public LuckyNumber getLuckyNumber() {
        int luckyNumber = new Random().nextInt(9) + 1;
        return new LuckyNumber(luckyNumber);
    }
}