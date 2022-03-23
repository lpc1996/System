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
    * role_user
    */
@Data
@Table(name = "role_user")
public class RoleUser {
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
    * 用户Id
    */
    private String userId;

    /**
    * 角色用户分配描述
    */
    private String info;
}