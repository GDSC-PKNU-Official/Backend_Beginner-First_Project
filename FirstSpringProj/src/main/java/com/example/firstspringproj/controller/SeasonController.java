package com.example.firstspringproj.controller;

import com.example.firstspringproj.model.Season;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeasonController {

    @GetMapping("/season")
    public String season() {
        Season season = new Season();
        return season.getSeason();

    }
}
