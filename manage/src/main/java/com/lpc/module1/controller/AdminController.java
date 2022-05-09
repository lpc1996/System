package com.lpc.module1.controller;

import com.lpc.module1.pojo.UserForm;
import com.lpc.module1.service.UserService;
import com.lpc.module1.util.CommonParams;
import com.lpc.module1.util.CookUtil;
import com.lpc.module1.util.RandomCodeUtil;
import com.lpc.module1.util.TokenUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
@SessionAttributes(value = {CommonParams.TOKEN_PAYLOAD_NAME})
public class AdminController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView view){
        view.setViewName("/login");
        return view;
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(ModelAndView view,HttpServletRequest request,HttpServletResponse response){

        CookUtil.delCookie(request,response,CommonParams.TOKEN);
        CookUtil.delCookie(request,response,CommonParams.REFRESH_TOKEN);
        CookUtil.delCookie(request,response,CommonParams.TOKEN_PAYLOAD_NAME);
        view.setViewName("redirect:/admin/login");
        return view;
    }

    @RequestMapping(value = "/getRandomCodeImg")
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

    @RequestMapping(value = "/check",method = RequestMethod.POST)
    public ModelAndView check(UserForm userForm,ModelAndView view,HttpServletRequest request,HttpServletResponse response){
        if(userService.checkPass(userForm)){
            view.setViewName("redirect:/index");
            String token = TokenUtils.token(userForm.getUserId(), CommonParams.TOKEN_END);
            CookUtil.addCookie(response,CommonParams.TOKEN,token,CommonParams.TOKEN_END);
            String refreshToken = TokenUtils.token(userForm.getUserId(),CommonParams.REFRESH_TOKEN_END);
            CookUtil.addCookie(response,CommonParams.REFRESH_TOKEN,refreshToken,CommonParams.REFRESH_TOKEN_END);
            CookUtil.addCookie(response,CommonParams.TOKEN_PAYLOAD_NAME,userForm.getUserId(),CommonParams.TOKEN_END);
            request.getSession().setAttribute(CommonParams.TOKEN_PAYLOAD_NAME,userForm.getUserId());
        }else{
            view.setViewName("redirect:/admin/login");
            System.out.println(userForm);
        }
        return view;
    }
}
