package com.lpc.module1.controller;

import com.lpc.module1.model.User;
import com.lpc.module1.pojo.LayuiRequest;
import com.lpc.module1.pojo.LayuiRespone;
import com.lpc.module1.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @package:com.lpc.module1.controller
 * @Author:旁观者
 * @Date:2022/5/8-15:09
 * @By:IntelliJ IDEA
 * @FileName:UserController.java
 */
@Log4j2
@Controller
@RequestMapping(value = "/sys/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView userView(ModelAndView view){

        view.setViewName("/sys/user");
        return view;
    }

    @PostMapping("/list")
    @ResponseBody
    public LayuiRespone<User> list(@RequestBody LayuiRequest<User> request){

        return userService.list(request);
    }

    @PostMapping(value = "/add")
    @ResponseBody
    public boolean add(@RequestBody User record){
        return userService.insertOrUpdate(1,record);
    }

    @PostMapping(value = "/edit")
    @ResponseBody
    public boolean edit(@RequestBody User record){
        return userService.insertOrUpdate(2,record);
    }

    @PostMapping(value = "/del")
    @ResponseBody
    public boolean del(@RequestBody User record){
        return userService.del(record);
    }
}
