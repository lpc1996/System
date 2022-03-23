package com.lpc.controller;

import com.lpc.model.User;
import com.lpc.pojo.UpdatePassForm;
import com.lpc.pojo.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public interface UserController {

    ModelAndView check(ModelAndView view,UserForm userForm, HttpServletResponse response, HttpServletRequest request,Model model);

    ModelAndView login(ModelAndView view,Model model);

    ModelAndView logout(ModelAndView view,HttpServletResponse response,HttpServletRequest request,Model model);

    void getRandomImage(HttpServletResponse response, HttpSession session);

    ModelAndView updatePass(ModelAndView view,Model model);

    ModelAndView checkNewPass(ModelAndView view,UpdatePassForm updatePassForm, HttpServletRequest request, Model model);

    ModelAndView personalInfo(ModelAndView view,HttpServletResponse response,HttpServletRequest request,Model model);

    String updateUser(User user, HttpServletResponse response, HttpServletRequest request, Model model);

    ModelAndView accountSettings(ModelAndView view,HttpServletResponse response,HttpServletRequest request,Model model);
}
