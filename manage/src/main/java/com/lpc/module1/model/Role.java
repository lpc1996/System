package com.lpc.module1.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * @package:com.lpc.module1.model
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
    * role
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "`role`")
public class Role extends MyModel {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 角色名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 角色描述
     */
    @Column(name = "info")
    private String info;
}