package com.example.GDSC.model;

public class Fortune {
    private String fortune;
    String[] list = {
            "매우 좋음",
            "좋음",
            "보통",
            "나쁨",
            "매우 나쁨"
    };

    public Fortune() {
        this.fortune = list[(int)(Math.random() * 5)];
    }

    public String getFortune() {
        return fortune;
    }

    public void setFortune(int index) {
        if (index < 0 || index >= list.length) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        this.fortune = list[index];
    }
}
