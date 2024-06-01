package com.example.GDSC.repository;

import com.example.GDSC.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class MemoryUserRepository implements UserRepository {
    private static Map<String, User> store = new HashMap<>();
    private static long sequence = 0L;
    @Override
    public User save(User user) {
        user.setId(++sequence);
        store.put(user.getLoginId(), user);
        return user;
    }

    @Override
    public Optional<User> findById(String loginId) {
        User user = store.get(loginId);
        return Optional.ofNullable(store.get(loginId));
    }

    @Override
    public Optional<User> findByName(String name) {
        return store.values().stream().filter(user -> user.getName().equals(name)).findAny();
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(store.values());
    }
}
