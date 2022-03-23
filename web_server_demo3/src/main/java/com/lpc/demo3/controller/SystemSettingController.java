package com.lpc.demo3.controller;

import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

/**
 * @package:com.lpc.demo1.controller
 * @Author:旁观者
 * @Date:2022/2/17-10:04
 * @By:IntelliJ IDEA
 * @FileName:SystemSettingController.java
 */
public interface SystemSettingController {

    ModelAndView userManage(ModelAndView view, Model model);

//    Object getUsers(Pagination page);

    ModelAndView roleManage(ModelAndView view, Model model);

    ModelAndView dictManage(ModelAndView view,Model model);

//    Object getDicts(Pagination pagination);
}
