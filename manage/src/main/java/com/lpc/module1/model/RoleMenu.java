package com.lpc.module1.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * @package:com.lpc.module1.model
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
    * role_menu
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "role_menu")
public class RoleMenu extends MyModel {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 角色Id
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 菜单Id
     */
    @Column(name = "menu_id")
    private Long menuId;

    /**
     * 角色权限分配描述
     */
    @Column(name = "info")
    private String info;
}