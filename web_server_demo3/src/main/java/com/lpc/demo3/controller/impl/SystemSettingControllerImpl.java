package com.lpc.demo3.controller.impl;

import com.lpc.demo3.controller.SystemSettingController;
import com.lpc.demo3.pojo.JqGridListForm;
import com.lpc.demo3.pojo.Pagination;
import com.lpc.demo3.service.impl.DictServiceImpl;
import com.lpc.demo3.service.impl.RoleServiceImpl;
import com.lpc.demo3.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @package:com.lpc.demo1.controller.impl
 * @Author:旁观者
 * @Date:2022/2/17-10:07
 * @By:IntelliJ IDEA
 * @FileName:SystemSettingControllerImpl.java
 */
@Controller
@RequestMapping(value = "/systemSetting",headers = "Accept=application/json;charset=utf-8")
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
    @RequestMapping(value = "/roleManage",method = RequestMethod.GET)
    public ModelAndView roleManage(ModelAndView view, Model model) {
//        List<Role> roles = roleService.findByPage(page,pageSize);
//        model.addAttribute("roles",roles);
        view.setViewName("systemSetting/roleManage");
        return view;
    }

    @RequestMapping(value = "/getRoles",method = RequestMethod.POST,headers = "Accept=application/json;charset=utf-8")
    @ResponseBody
    public JqGridListForm getRoles(Pagination pagination){
        JqGridListForm jqGridListForm = roleService.findByPage(pagination);
        return jqGridListForm;
    }

    @Override
    @RequestMapping(value = "/dictManage",method = RequestMethod.GET)
    public ModelAndView dictManage(ModelAndView view, Model model) {
        view.setViewName("systemSetting/dictManage");
        return view;
    }

    @RequestMapping(value = "/getDicts",method = RequestMethod.POST)
    @ResponseBody
    public JqGridListForm getDicts(Pagination pagination) {
        JqGridListForm jqGridListForm = dictService.findByPage(pagination);
        return jqGridListForm;
    }

    @RequestMapping(value = "/editDict",method = RequestMethod.POST)
    @ResponseBody
    public JqGridListForm editDict(HttpServletRequest request,HttpServletResponse response){

        Pagination pagination = new Pagination();
        pagination.setPage(1);
        pagination.setRecords(1);
        pagination.setRows(1);
        pagination.setSidx("id");
        pagination.setSord("desc");
        JqGridListForm jqGridListForm = dictService.findByPage(pagination);
        return jqGridListForm;
    }

//    @RequestMapping(value="updateDicts",method = RequestMethod.POST)
//    @ResponseBody
//    public JqGridListForm updateDicts(Dict dict){
//
//        return null;
//    }
//
//    @RequestMapping(value="addDict",method = RequestMethod.POST)
//    @ResponseBody
//    public JqGridListForm addDict(Dict dict){
//        if(dictService.addDict(dict)){
//
//        }
//        return null;
//    }
//
//    public JqGridListForm delDict()
}
