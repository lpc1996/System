package com.lpc.module2.mapper;

import com.lpc.module2.model.SysMenu;

import java.util.List;

/**
 * @package:com.lpc.module2.mapper
 * @Author:旁观者
 * @Date:2022/5/2-16:46
 * @By:IntelliJ IDEA
 */


public interface SysMenuMapper extends MyMapper {

    List<SysMenu> getMenuByUserId(String id);
}