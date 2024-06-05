package com.chaechae.project1.Controller;

import com.chaechae.project1.Model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<>();

    @GetMapping("/get")
    public List<User> getUsers() {
        return users;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
}
