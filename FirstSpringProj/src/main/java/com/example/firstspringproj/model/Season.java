package com.example.firstspringproj.model;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private List<String> seasons;

    public Season() {
        this.seasons = new ArrayList<>();
        seasons.add("Winter");
        seasons.add("Spring");
        seasons.add("Summer");
        seasons.add("Autumn");
    }

    public String getSeason() {
        int randomIndex = (int) (Math.random() * seasons.size());
        return seasons.get(randomIndex);
    }

}