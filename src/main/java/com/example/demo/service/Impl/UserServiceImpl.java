package com.example.demo.service.Impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User loginIn(String name, String password) {
        return userMapper.getInfo(name, password);
    }

    @Override
    public String add(String name, String password) {
        userMapper.addInfo(name, password);
       return "error";
    }
}
