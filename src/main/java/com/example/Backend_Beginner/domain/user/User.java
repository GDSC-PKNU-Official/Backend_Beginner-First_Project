package com.example.Backend_Beginner.domain.user;

public class User {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public User(String name, Integer age) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
        this.age = age;

    }
}
