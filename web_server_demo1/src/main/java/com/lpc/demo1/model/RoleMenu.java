package com.lpc.demo1.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */

/**
    * role_menu
    */
@Data
@Table(name = "role_menu")
public class RoleMenu {
    /**
    * 主键
    */
    @Id
    @GeneratedValue(generator = "JDBC")
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