package com.rain.community.controller;

import com.rain.community.domain.User;
import com.rain.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: rain
 * @description: todo
 * @date: 2021-11-06 20:40
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public @ResponseBody User getUser(@PathVariable("id") Integer id) {
        return userService.findUserById(id);
    }
}
