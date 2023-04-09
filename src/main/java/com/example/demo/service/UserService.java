package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    User loginIn(String name, String password);
    String add(String name, String password);
}
