package com.lpc.module1.controller;

import com.lpc.module1.model.Role;
import com.lpc.module1.model.User;
import com.lpc.module1.pojo.LayuiRequest;
import com.lpc.module1.pojo.LayuiRespone;
import com.lpc.module1.service.RoleService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @package:com.lpc.module1.controller
 * @Author:旁观者
 * @Date:2022/5/8-18:35
 * @By:IntelliJ IDEA
 * @FileName:RoleController.java
 */
@Log4j2
@Controller
@RequestMapping(value = "/sys/role")
public class RoleController {

    @Resource
    private RoleService roleService;

    @RequestMapping("/")
    public ModelAndView roleView(ModelAndView view){

        view.setViewName("/sys/role");
        return view;
    }

    @PostMapping("/list")
    @ResponseBody
    public LayuiRespone<Role> list(@RequestBody LayuiRequest<Role> request){

        return roleService.list(request);
    }

    @PostMapping(value = "/add")
    @ResponseBody
    public boolean add(@RequestBody Role record){
        return roleService.insertOrUpdate(1,record);
    }

    @PostMapping(value = "/edit")
    @ResponseBody
    public boolean edit(@RequestBody Role record){
        return roleService.insertOrUpdate(2,record);
    }

    @PostMapping(value = "/del")
    @ResponseBody
    public boolean del(@RequestBody Role record){
        return roleService.del(record);
    }
}
