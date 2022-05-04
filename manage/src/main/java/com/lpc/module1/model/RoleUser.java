package com.lpc.module1.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * @package:com.lpc.module1.model
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
    * role_user
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "role_user")
public class RoleUser extends MyModel {
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
     * 用户Id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 角色用户分配描述
     */
    @Column(name = "info")
    private String info;
}