package com.lpc.demo3.controller.impl;

import com.lpc.demo3.controller.SystemSettingController;
import com.lpc.demo3.model.Role;
import com.lpc.demo3.model.SysDict;
import com.lpc.demo3.model.User;
import com.lpc.demo3.pojo.JqGridListForm;
import com.lpc.demo3.pojo.Pagination;
import com.lpc.demo3.pojo.SearchPagination;
import com.lpc.demo3.service.impl.DictServiceImpl;
import com.lpc.demo3.service.impl.RoleServiceImpl;
import com.lpc.demo3.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
public class SystemSettingControllerImpl implements SystemSettingController {

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

    @RequestMapping(value = "/editUser",method = RequestMethod.POST)
    @ResponseBody
    public boolean editUser(User user,@RequestParam(required = true) String editType){
        if(editType.equals("edit")){
            return userService.updateUser(user);
        }else if(editType.equals("insert")){
            return userService.regsiter(user,user.getPass());
        }
        return false;
    }

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

    @RequestMapping(value = "/editRole",method = RequestMethod.POST)
    @ResponseBody
    public boolean editRole(Role role, @RequestParam(required = true) String editType){

        if(editType.equals("edit")){
            return roleService.updateRole(role);
        }else if(editType.equals("insert")){
            return roleService.addRole(role);
        }
        return false;
    }

    @RequestMapping(value = "/delRole",method = RequestMethod.POST)
    @ResponseBody
    public boolean delRole(@RequestParam(required = true) Role role){
        return roleService.delRole(role);
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

    @RequestMapping(value = "/searchDict",method = RequestMethod.POST)
    public JqGridListForm searchDict(SearchPagination searchPagination){

        return null;
    }

    @RequestMapping(value = "/editDict",method = RequestMethod.POST)
    @ResponseBody
    public boolean editDict(SysDict sysDict,@RequestParam(value = "editType",required = true) String editType){
        boolean result = false;
        if (editType.equals("insert")){
            sysDict.setId(null);
            result = dictService.addDict(sysDict);
        }else if(editType.equals("edit")){
            result = dictService.updateDict(sysDict);
        }else{

        }
        return result;
    }

    @RequestMapping(value = "/delDict",method = RequestMethod.POST)
    @ResponseBody
    public boolean delDict(SysDict sysDict){
        if (sysDict.getId() != null){
            return dictService.delDict(sysDict);
        }
        return false;
    }

}
