package com.lpc.module2.service;

import com.lpc.module2.model.Menu;
import com.lpc.module2.model.SysMenu;

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

    List<SysMenu> getMenu(String userId);
}
