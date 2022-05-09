package com.lpc.module1.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @package:com.lpc.module1.interceptor
 * @Author:旁观者
 * @Date:2022/5/5-14:14
 * @By:IntelliJ IDEA
 * @FileName:LoginInterceptor.java
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception{
        String url=httpServletRequest.getRequestURI();
        if(url.indexOf("/toLogin")>=0||url.indexOf("/login")>=0){
            return true;
        }
        HttpSession session=httpServletRequest.getSession();
        Object obj=session.getAttribute("user");
        if(obj==null)
            return true;
        httpServletRequest.setAttribute("msg","还没有登陆，请先登录");
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(httpServletRequest,httpServletResponse);
        return false;
    }
}
