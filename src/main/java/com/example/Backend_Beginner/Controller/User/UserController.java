package com.example.Backend_Beginner.Controller.User;

import com.example.Backend_Beginner.domain.user.User;
import com.example.Backend_Beginner.dto.user.request.UserCreateRequest;
import com.example.Backend_Beginner.dto.user.response.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final List<User> users = new ArrayList<>();

    @PostMapping("/User") //Post /user
    public void saveUser(@RequestBody UserCreateRequest request) {
        users.add(new User(request.getName(), request.getAge()));
    }

    @GetMapping("/User")
    public List<UserResponse> getUser(){
        List<UserResponse> userResponses = new ArrayList<>();
        for(int i =0; i<users.size(); i++){
            userResponses.add(new UserResponse(i+1, users.get(i).getName(), users.get(i).getAge()));
        }
        return userResponses;
    }
}
