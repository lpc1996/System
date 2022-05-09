package com.lpc.module1.controller;

import com.lpc.module1.model.SysDict;
import com.lpc.module1.pojo.LayuiRequest;
import com.lpc.module1.pojo.LayuiRespone;
import com.lpc.module1.service.SysDictService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @package:com.lpc.module1.controller
 * @Author:旁观者
 * @Date:2022/5/6-12:35
 * @By:IntelliJ IDEA
 * @FileName:DictController.java
 */
@Controller
@RequestMapping(value = "/sys/dict")
public class DictController {

    @Resource
    private SysDictService sysDictService;

    @RequestMapping(value = "/")
    public ModelAndView dict(ModelAndView view){
        view.setViewName("sys/dict");
        return view;
    }

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    @ResponseBody
    public LayuiRespone<SysDict> list(@RequestBody LayuiRequest<SysDict> request){
        return sysDictService.sysDict(request);
    }

    @PostMapping(value = "/add")
    @ResponseBody
    public boolean add(@RequestBody SysDict record){
        return sysDictService.insertOrUpdate("insert",record);
    }

    @PostMapping(value = "/edit")
    @ResponseBody
    public boolean edit(@RequestBody SysDict record){
        return sysDictService.insertOrUpdate("edit",record);
    }

    @PostMapping(value = "/del")
    @ResponseBody
    public boolean del(@RequestBody SysDict record){
        return sysDictService.del(record);
    }

//    public List<SysDict>
}
