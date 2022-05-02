package com.lpc.module1.controller;

import com.lpc.module2.service.impl.MenuServiceImpl;
import com.lpc.module2.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @package:com.lpc.module1.controller
 * @Author:旁观者
 * @Date:2022/5/1-16:25
 * @By:IntelliJ IDEA
 * @FileName:AndminController.java
 */
@Controller
@RequestMapping(value = "/admin",headers = "Accept=application/json;charset=utf-8")
public class AndminController {

    @Resource
    private UserServiceImpl userService;

    @Resource
    private MenuServiceImpl menuService;


}
