package com.lpc.module1.filter;

import com.lpc.module1.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionTimeOutFilter implements HandlerInterceptor {

    public String[] allowUrls;

    public void setAllowUrls(String[] allowUrls){
        this.allowUrls = allowUrls;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {
        String requestUrl = request.getRequestURI().replace(request.getContextPath(), "");
        if (null != allowUrls && allowUrls.length >= 1)
            for (String url : allowUrls) {
                if (requestUrl.contains(url)) {
                    return true;
                }
            }
        User user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            return true; // 返回true，则这个方面调用后会接着调用postHandle(), afterCompletion()
        } else {
            // 未登录 跳转到登录页面
            throw new SessionTimeoutException();// 返回到配置文件中定义的路径
        }
    }
}
