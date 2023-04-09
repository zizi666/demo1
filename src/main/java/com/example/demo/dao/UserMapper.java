package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User getInfo(String name, String password);
    void addInfo(String name, String password);
}
