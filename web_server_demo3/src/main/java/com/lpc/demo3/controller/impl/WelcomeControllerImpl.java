package com.lpc.demo3.controller.impl;

import com.lpc.demo3.controller.WelcomeController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @package:com.lpc.demo1.controller.impl
 * @Author:旁观者
 * @Date:2022/2/14-19:40
 * @FileName:WelcomeControllerImpl.java
 * @By:IntelliJ IDEA
 */
@Controller
@RequestMapping(value = "/")
public class WelcomeControllerImpl implements WelcomeController {
    @Override
    @RequestMapping(value = "/index")
    public ModelAndView index(ModelAndView view, HttpServletRequest request, HttpServletResponse response) {
        view.setViewName("index");
        return view;
    }

    @RequestMapping(value = "/welcome")
    public ModelAndView welcome(ModelAndView view, Model model){
        view.setViewName("welcome");
        return view;
    }
}
