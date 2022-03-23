package com.lpc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class WebController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String welcome(){
        return "index";
    }

    @RequestMapping(value = "index" ,method = RequestMethod.GET)
    public String index(){
        return "index";
    }


}
