package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
        User userBean = userService.loginIn("a","a");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }
}
