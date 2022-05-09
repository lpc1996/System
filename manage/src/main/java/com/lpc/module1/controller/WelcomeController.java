package com.lpc.module1.controller;

import com.lpc.module1.pojo.InitRespone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @package:com.lpc.module1.controller
 * @Author:旁观者
 * @Date:2022/5/5-16:27
 * @By:IntelliJ IDEA
 * @FileName:WelcomeController.java
 */
@Controller
public class WelcomeController {


    @RequestMapping(value = "/index")
    public ModelAndView index(ModelAndView view){
        view.setViewName("index");
        return view;
    }

    @RequestMapping(value = "/welcome")
    public ModelAndView welcome(ModelAndView view){
        view.setViewName("welcome");
        return view;
    }
}
