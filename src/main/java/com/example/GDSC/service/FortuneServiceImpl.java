package com.example.GDSC.service;

import com.example.GDSC.model.Fortune;
import org.springframework.stereotype.Service;

@Service
public class FortuneServiceImpl implements FortuneService{

    @Override
    public String createFortune() {
        Fortune fortune = new Fortune();
        return fortune.getFortune();
    }
}
