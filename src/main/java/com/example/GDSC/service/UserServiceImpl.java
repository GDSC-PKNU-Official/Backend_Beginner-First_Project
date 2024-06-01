package com.example.GDSC.service;

import com.example.GDSC.model.User;
import com.example.GDSC.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public Long join(User user) {
        validateDuplicateUser(user);
        userRepository.save(user);
        return user.getId();
    }

    private void validateDuplicateUser(User user) {
        userRepository.findByName(user.getName())
                .ifPresent(u -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    @Override
    public List<User> findUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findOne(String loginId, String password){
        Optional<User> findUser = userRepository.findById(loginId);
        validatePassword(findUser, password);
        return findUser;
    }

    private void validatePassword(Optional<User> findUser, String password) {
        if(findUser.isEmpty()) {
            throw new IllegalArgumentException("존재하지 않는 회원입니다.");
        }

        findUser.ifPresent(u -> {
            if (!u.getPassword().equals(password))
                throw new IllegalStateException("비밀 번호가 틀렸습니다.");
        });
    }
}
