package com.lpc.service.impl;

import com.lpc.util.SpringUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Test
    public void login() {
        ApplicationContext applicationContext = SpringUtil.getApplicationContext();
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        System.out.println(userService.login("07161075","1602614lpc"));
    }
}