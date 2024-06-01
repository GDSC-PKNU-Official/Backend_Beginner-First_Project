package com.example.GDSC.service;

import com.example.GDSC.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Long join(User user);

    List<User> findUsers();

    Optional<User> findOne(String loginId, String password);
}

