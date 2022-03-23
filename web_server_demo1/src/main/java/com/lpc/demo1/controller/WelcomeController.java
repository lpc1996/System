package com.lpc.demo1.controller;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @package:com.lpc.demo1.controller
 * @Author:旁观者
 * @Date:2022/2/14-19:38
 * @FileName:WelcomeController.java
 * @By:IntelliJ IDEA
 */
public interface WelcomeController {

    ModelAndView index(ModelAndView view, HttpServletRequest request, HttpServletResponse response);
}
