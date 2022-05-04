package com.lpc.module1.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * @package:com.lpc.module1.model
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
    * 系统菜单表
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "sys_menu")
public class SysMenu extends MyModel {
    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 父ID
     */
    @Column(name = "pid")
    private Integer pid;

    /**
     * 名称
     */
    @Column(name = "title")
    private String title;

    /**
     * 菜单图标
     */
    @Column(name = "icon")
    private String icon;

    /**
     * 链接
     */
    @Column(name = "href")
    private String href;

    /**
     * 链接打开方式
     */
    @Column(name = "target")
    private String target;

    /**
     * 菜单排序
     */
    @Column(name = "sort")
    private Integer sort;

    /**
     * 状态(0:禁用,1:启用)
     */
    @Column(name = "`status`")
    private Byte status;

    /**
     * 备注信息
     */
    @Column(name = "remark")
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 更新时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 删除时间
     */
    @Column(name = "delete_at")
    private Date deleteAt;
}