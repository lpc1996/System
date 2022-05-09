package com.lpc.module1.service;

import com.lpc.module1.model.MyModel;
import com.lpc.module1.pojo.LayuiRespone;

import java.util.List;

/**
 * @package:com.lpc.module1.service
 * @Author:旁观者
 * @Date:2022/5/8-15:23
 * @By:IntelliJ IDEA
 * @FileName:MyService.java
 */

public class MyService <T extends MyModel> {

    protected LayuiRespone<T> createLayuiResponse(int code, String msg, int count, List<T> data){
        LayuiRespone<T> respone = new LayuiRespone<>();
        respone.setCount(count);
        respone.setMessage(msg);
        respone.setCode(code);
        respone.setData(data);
        return respone;
    }
}
