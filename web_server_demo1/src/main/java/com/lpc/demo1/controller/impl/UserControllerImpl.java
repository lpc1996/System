package com.lpc.demo1.controller.impl;

import com.lpc.demo1.controller.UserController;
import com.lpc.demo1.pojo.UserForm;
import com.lpc.demo1.service.impl.UserServiceImpl;
import com.lpc.demo1.util.RandomCodeUtil;
import com.lpc.demo1.model.Archive;
import com.lpc.demo1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @package:com.lpc.demo1.controller.impl
 * @Author:旁观者
 * @Date:2022/2/14-22:11
 * @By:IntelliJ IDEA
 * @FileName:UserControllerImpl.java
 */
@Controller
@RequestMapping(value = "/user")
@SessionAttributes(names = {"user","archive"})
public class UserControllerImpl extends BaseController implements UserController {

    @Resource
    private UserServiceImpl userService;

    @Resource
    private CookieController cookieController;

    @RequestMapping(value = "/login")
    @Override
    public ModelAndView login(ModelAndView view, HttpServletRequest request, HttpServletResponse response) {
        view.setViewName("user/login");
        return view;
    }

    @RequestMapping(value = "/check", method = RequestMethod.POST)
    @Override
    public ModelAndView check(UserForm userForm, ModelAndView view, HttpServletRequest request, HttpServletResponse response, Model model) {
        System.out.println(userForm.toString());
        if (!RandomCodeUtil.checkCode(userForm.getRandomCode())) {
            view.addObject("errMsg", "验证码错误,请重新输入");
            view.setViewName("redirect:/user/login");
        } else if (!userService.login(userForm.getUserId(), userForm.getPassword())) {
            view.addObject("errMsg", "登陆失败，用户名或密码错误");
            view.setViewName("redirect:/user/login");
        } else {
            User user = userService.getUser(userForm.getUserId());
            model.addAttribute("user", user);
            cookieController.addCookie(response, "userId", userForm.getUserId());
            cookieController.addCookie(response, "userName", user.getName());
            cookieController.addCookie(response,"userImg",user.getImgUrl());
            view.setViewName("redirect:/index");
        }
        return view;
    }

    @Override
    @RequestMapping(value = "/logout")
    public ModelAndView logout(ModelAndView view, HttpServletRequest request, HttpServletResponse response) {
        cookieController.delCookie(request, response, "userId");
        cookieController.delCookie(request, response, "userName");
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        view.setViewName("redirect:/user/login");
        return view;
    }

    @Override
    @RequestMapping(value = "/personalInfo")
    public ModelAndView personalInfo(ModelAndView view, HttpServletRequest request, HttpServletResponse response, Model model) {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        Archive archive = userService.getArchive(user.getId());
        model.addAttribute("archive", archive);
        model.addAttribute("user", user);
        view.setViewName("user/personalInfo");
        return view;
    }

    @Override
    @RequestMapping(value = "/updatePass")
    public ModelAndView updatePass(ModelAndView view, HttpServletRequest request, HttpServletResponse response) {
        view.setViewName("user/updatePass");
        return view;
    }

    @Override
    @RequestMapping(value = "/checkPass", method = RequestMethod.POST)
    public ModelAndView checkPass(ModelAndView view, HttpServletRequest request, HttpServletResponse response, Model model) {
        return view;
    }

    @RequestMapping(value = "/getRandomCodeImg")
    @Override
    public void getRandomCodeImg(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        String code = RandomCodeUtil.drawImage(output);
        session.setAttribute("randomCodeImage", code);
        try {
            ServletOutputStream out = response.getOutputStream();
            output.writeTo(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    @RequestMapping(value = "accountSettings")
    public ModelAndView accountSettings(ModelAndView view, HttpServletRequest request, HttpServletResponse response, Model model) {
        view.setViewName("user/accountSetting");
        return view;
    }

    @Override
    @RequestMapping(value = "updateUser")
    public ModelAndView updateUser(ModelAndView view, User user, HttpServletRequest request, HttpServletResponse response, Model model) {

        view.setViewName("redirect:/user/psersonalInfo");
        return view;
    }

}
