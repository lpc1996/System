package com.lpc.module1.controller;

import com.lpc.module1.pojo.UserForm;
import com.lpc.module1.service.UserService;
import com.lpc.module1.util.RandomCodeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @package:com.lpc.module1.controller
 * @Author:旁观者
 * @Date:2022/5/4-15:47
 * @By:IntelliJ IDEA
 * @FileName:AdminController.java
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView view){
        view.setViewName("/login");
        return view;
    }

    @RequestMapping(value = "getRandomCodeImg")
    public void getRandomCodeImg(HttpServletRequest request, HttpServletResponse response){
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

    @RequestMapping(value = "check",method = RequestMethod.POST)
    @ResponseBody
    public boolean check(UserForm userForm){
        return userService.checkPass(userForm);
    }
}
