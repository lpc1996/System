package com.lpc.demo3.model;

import lombok.Data;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */

/**
    * role_menu
    */
@Data
public class RoleMenu {
    /**
    * 主键
    */
    private Long id;

    /**
    * 角色Id
    */
    private Long roleId;

    /**
    * 菜单Id
    */
    private Long menuId;

    /**
    * 角色权限分配描述
    */
    private String info;
}