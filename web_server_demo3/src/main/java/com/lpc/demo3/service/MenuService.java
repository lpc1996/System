package com.lpc.demo3.service;

import com.lpc.demo3.model.Menu;

import java.util.List;

/**
 * @package:com.lpc.demo3.service
 * @Author:旁观者
 * @Date:2022/3/21-15:48
 * @By:IntelliJ IDEA
 * @FileName:MenuService.java
 */
public interface MenuService extends Service{

    List<Menu> getUserMenu(String userId);
}
