package com.example.UserManager.controller;

import com.example.UserManager.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<>();

    @PostMapping
    public User addUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        Optional<User> user = users.stream().filter(u -> u.getEmail().equals(email)).findFirst();
        return user.orElse(null);
    }

    @DeleteMapping("/{email}")
    public User deleteUserByEmail(@PathVariable String email) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getEmail().equals(email)) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}

