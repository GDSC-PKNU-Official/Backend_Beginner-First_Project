package com.example.GDSC.controller;

import com.example.GDSC.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class fortuneContoller {

    private final FortuneService fortuneService;

    @Autowired
    public fortuneContoller(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @ResponseBody
    @GetMapping("/fortune")
    public ResponseEntity<String> getFortune() {
        String fortuneData = fortuneService.createFortune();
        return ResponseEntity.ok(fortuneData);
    }
}
