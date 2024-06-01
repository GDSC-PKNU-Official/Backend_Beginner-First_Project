package com.example.GDSC.repository;

import com.example.GDSC.model.User;

import java.util.Optional;
import java.util.List;
public interface UserRepository {
    User save(User User);
    Optional<User> findById(String loginId);
    Optional<User> findByName(String name);
    List<User> findAll();
}
