package com.lpc.module1.controller;

import com.lpc.module1.model.SysMenu;
import com.lpc.module1.pojo.LayuiRespone;
import com.lpc.module1.service.SysMenuService;
import com.lpc.module1.util.CommonParams;
import com.lpc.module1.util.CookUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @package:com.lpc.module1.controller
 * @Author:旁观者
 * @Date:2022/5/5-16:52
 * @By:IntelliJ IDEA
 * @FileName:MenuController.java
 */
@Controller
@RequestMapping(value = "/sys/menu")
public class MenuController {

    @Resource
    private SysMenuService sysMenuService;

    @RequestMapping(value = "/menuManage")
    public ModelAndView menuManage(ModelAndView view){
        view.setViewName("/sys/menu");
        return view;
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public LayuiRespone<SysMenu> list(){

        LayuiRespone<SysMenu> menuRespone = sysMenuService.getAllMenu();
        return menuRespone;
    }

    @RequestMapping(value = "/init")
    @ResponseBody
    public Map<String,Object> init(HttpServletRequest request, HttpServletResponse respone){
        Cookie cookie = CookUtil.getCookieByName(request, CommonParams.TOKEN_PAYLOAD_NAME);
        String userName = cookie != null ? cookie.getValue() : null;
        return sysMenuService.init(userName);
    }
}
