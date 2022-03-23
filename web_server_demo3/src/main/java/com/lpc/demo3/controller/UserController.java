package com.lpc.demo3.controller;

import com.lpc.demo3.model.User;
import com.lpc.demo3.pojo.UserForm;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @package:com.lpc.demo1.controller
 * @Author:旁观者
 * @Date:2022/2/14-22:02
 * @FileName:UserController.java
 * @By:IntelliJ IDEA
 */
public interface UserController {

    ModelAndView login(ModelAndView view, HttpServletRequest request, HttpServletResponse response);

    ModelAndView check(UserForm userForm,ModelAndView view, HttpServletRequest request, HttpServletResponse response,Model model);

    ModelAndView logout(ModelAndView view, HttpServletRequest request, HttpServletResponse response);

    ModelAndView personalInfo(ModelAndView view, HttpServletRequest request, HttpServletResponse response,Model model);

    ModelAndView updatePass(ModelAndView view, HttpServletRequest request, HttpServletResponse response);

    ModelAndView checkPass(ModelAndView view, HttpServletRequest request, HttpServletResponse response,Model model);

    void getRandomCodeImg(HttpServletRequest request, HttpServletResponse response);

    ModelAndView accountSettings(ModelAndView view, HttpServletRequest request, HttpServletResponse response,Model model);

    ModelAndView updateUser(ModelAndView view, User user, HttpServletRequest request, HttpServletResponse response, Model model);
}
