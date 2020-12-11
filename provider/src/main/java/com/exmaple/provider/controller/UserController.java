package com.exmaple.provider.controller;

import com.exmaple.provider.entity.User;
import com.exmaple.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getall")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public String getAll(){
        List<User> users=userService.findAll();
        return users.toString();
    }
}
