package com.lpc.demo1.controller.impl;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @package:com.lpc.demo1.controller.impl
 * @Author:旁观者
 * @Date:2022/2/16-14:34
 * @By:IntelliJ IDEA
 * @FileName:controller.java
 */
public class BaseController {
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setLenient(false);
        CustomDateEditor dateEditor = new CustomDateEditor(simpleDateFormat, true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }
}
