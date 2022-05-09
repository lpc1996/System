package com.lpc.module1.service;

import com.lpc.module1.util.CommonParams;
import com.lpc.module1.util.CookUtil;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * web应用的全局事件
 * @package:com.lpc.module1.service
 * @Author:旁观者
 * @Date:2022/5/6-12:15
 * @By:IntelliJ IDEA
 * @FileName:Global.java
 */
@Service
public class Global {

    /**
     * 在web启动时执行
     */
    @PostConstruct
    public void applicationStart(){

        System.out.println("application start");

    }

    /**
     * 在web结束时执行
     */

    @PreDestroy
    public void applicationEnd(HttpServletRequest request, HttpServletResponse response){

        HttpSession session = request.getSession();
        session.invalidate();
        CookUtil.delCookie(request,response, CommonParams.TOKEN);
        CookUtil.delCookie(request,response,CommonParams.REFRESH_TOKEN);
        System.out.println("InskyScheduleCenter application end");
    }
}
