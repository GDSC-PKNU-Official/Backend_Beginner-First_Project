package com.example.GDSC.controller;

import com.example.GDSC.model.User;
import com.example.GDSC.model.UserForm;
import com.example.GDSC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users/new")
    public String createForm(){
        return "users/createUserForm";
    }

    @PostMapping("/users/new")
    public String create (@ModelAttribute UserForm form){
        User user = new User();
        user.setName(form.getName());
        user.setNickname(form.getNickname());
        user.setLoginId(form.getLoginId());
        user.setPassword(form.getPassword());

        userService.join(user);
        return "redirect:/";
    }

    @GetMapping(value = "/users")
    public String list(Model model) {
        List<User> users = userService.findUsers();
        model.addAttribute("users", users);
        return "users/userList";
    }

    @GetMapping(value = "/users/find")
    public String dispatchFindUserForm(){
        return "users/getUserInfo";
    }

    @GetMapping(value = "/users/info")
    public String findOne(@ModelAttribute UserForm form, Model model) {
        Optional<User> findUser = userService.findOne(form.getLoginId(), form.getPassword());
        model.addAttribute("findUser", findUser.get());
        return "users/userInfo";
    }
}
