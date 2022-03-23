package com.lpc.demo1.controller;

import com.lpc.demo1.model.User;
import com.lpc.demo1.pojo.JqGridListForm;
import com.lpc.demo1.pojo.Pagination;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
