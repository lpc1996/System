package com.lpc.module1.filter;

import com.lpc.module1.model.User;
import com.lpc.module1.util.CommonParams;
import com.lpc.module1.util.CookUtil;
import com.lpc.module1.util.TokenUtils;
import ognl.Token;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@SessionAttributes(value = {CommonParams.TOKEN_PAYLOAD_NAME})
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
        Cookie token = CookUtil.getCookieByName(request, CommonParams.TOKEN);
        Cookie refresh_token = CookUtil.getCookieByName(request,CommonParams.REFRESH_TOKEN);
        boolean verifyToken = token != null && TokenUtils.verify(token.getValue());

        boolean verifyRefresh = refresh_token != null && TokenUtils.verify(refresh_token.getValue());
        if (verifyToken && verifyRefresh) {
            return true; // 返回true，则这个方面调用后会接着调用postHandle(), afterCompletion()
        } else if(verifyRefresh && !verifyToken){
            String userName = (String) TokenUtils.getParamsByToken(refresh_token.getValue(), CommonParams.TOKEN_PAYLOAD_NAME);
            String newToken = TokenUtils.token(userName,CommonParams.TOKEN_END);
            if(token == null){
                CookUtil.addCookie(response,CommonParams.TOKEN,newToken,CommonParams.TOKEN_END);
            }else{
                CookUtil.editCookie(request,response,"token",newToken);
            }
            Cookie un = CookUtil.getCookieByName(request,CommonParams.TOKEN_PAYLOAD_NAME);
            if(un == null){
                CookUtil.addCookie(response,CommonParams.TOKEN_PAYLOAD_NAME,userName,CommonParams.TOKEN_END);
                request.getSession().setAttribute(CommonParams.TOKEN_PAYLOAD_NAME,userName);
            }
            System.out.println("token更新完毕");
            return true;
        }else {
            // 未登录 清除token和refresh_token并跳转到登录页面
            CookUtil.delCookie(request,response,CommonParams.TOKEN);
            CookUtil.delCookie(request,response,CommonParams.REFRESH_TOKEN);
            throw new SessionTimeoutException();// 返回到配置文件中定义的路径
        }
    }
}
