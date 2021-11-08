package com.rain.community.service;

import com.rain.community.domain.User;
import com.rain.community.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: rain
 * @description: todo
 * @date: 2021-11-06 20:39
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Integer id) {
        return userMapper.selectUserById(id);
    }
}
