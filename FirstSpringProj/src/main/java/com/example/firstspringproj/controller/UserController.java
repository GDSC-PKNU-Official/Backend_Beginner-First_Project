package com.example.firstspringproj.controller;


import com.example.firstspringproj.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController{
    private List<User> users = new ArrayList<>();

    @GetMapping("/get")
    public List<User> getUsers(){
        return users;
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String name){
        User user = new User(name);
        users.add(user);
        return "User " + name+" 추가되었습니다.";
    }

    @DeleteMapping("/remove")
    public String removeUser(@RequestParam String name){
        for (User user : users) {
            if (user.getName().equals(name)) {
                users.remove(user);
                return "User " + name + " 삭제되었습니다.";
            }
        }
        return "User " + name + "을 찾을 수 없습니다.";
    }
}
