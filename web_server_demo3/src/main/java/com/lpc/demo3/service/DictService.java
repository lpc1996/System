package com.lpc.demo3.service;

import com.lpc.demo3.model.Dict;

/**
 * @package:com.lpc.demo1.service
 * @Author:旁观者
 * @Date:2022/2/21-10:45
 * @By:IntelliJ IDEA
 * @FileName:DictService.java
 */
public interface DictService extends Service {

    public boolean addDict(Dict record);
}
