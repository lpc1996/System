package com.lpc.demo1.controller.impl;

import com.alibaba.fastjson.JSON;
import com.lpc.demo1.controller.SystemSettingController;
import com.lpc.demo1.pojo.JqGridListForm;
import com.lpc.demo1.pojo.JsGridRequest;
import com.lpc.demo1.pojo.JsGridRespone;
import com.lpc.demo1.pojo.Pagination;
import com.lpc.demo1.service.impl.DictServiceImpl;
import com.lpc.demo1.service.impl.RoleServiceImpl;
import com.lpc.demo1.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @package:com.lpc.demo1.controller.impl
 * @Author:旁观者
 * @Date:2022/2/17-10:07
 * @By:IntelliJ IDEA
 * @FileName:SystemSettingControllerImpl.java
 */
@Controller
@RequestMapping(value = "/systemSetting",headers = "Accept=application/json;charset=utf-8")
//@SessionAttributes(value = {"users","roles","dicts"})
public class SystemSettingControllerImpl extends BaseController implements SystemSettingController {

    @Resource
    private UserServiceImpl userService;
    @Resource
    private RoleServiceImpl roleService;
    @Resource
    private DictServiceImpl dictService;


    @Override
    @RequestMapping(value = "/userManage",method = RequestMethod.GET)
    public ModelAndView userManage(ModelAndView view, Model model) {
//        List<User> users = userService.getUsersByPage(page,pageSize);
        view.setViewName("systemSetting/userManage");
        return view;
    }

    @RequestMapping(value = "/getUsers",method = RequestMethod.POST,headers = "Accept=application/json;charset=utf-8")
    @ResponseBody
    public JqGridListForm getUsers(Pagination pagination){
        JqGridListForm jqGridListForm = userService.findByPage(pagination);
        return jqGridListForm;
    }

//    public


    @Override
    @RequestMapping(value = "roleManage",method = RequestMethod.GET)
    public ModelAndView roleManage(ModelAndView view, Model model) {
//        List<Role> roles = roleService.findByPage(page,pageSize);
//        model.addAttribute("roles",roles);
        view.setViewName("systemSetting/roleManage");
        return view;
    }

    @RequestMapping(value = "getRoles",method = RequestMethod.POST,headers = "Accept=application/json;charset=utf-8")
    @ResponseBody
    public JqGridListForm getRoles(Pagination pagination){
        JqGridListForm jqGridListForm = roleService.findByPage(pagination);
        return jqGridListForm;
    }

    @Override
    @RequestMapping(value = "dictManage",method = RequestMethod.GET)
    public ModelAndView dictManage(ModelAndView view, Model model) {
//        List<Dict> dicts = dictService.findByPage(page,pageSize);
//        model.addAttribute("dicts",dicts);
        view.setViewName("systemSetting/dictManage");
        return view;
    }

    @RequestMapping(value = "getDicts",method = RequestMethod.POST,headers = "Accept=application/json;charset=utf-8")
    @ResponseBody
    public JqGridListForm getDicts(Pagination pagination) {
        JqGridListForm jqGridListForm = dictService.findByPage(pagination);
        return jqGridListForm;
    }


}
