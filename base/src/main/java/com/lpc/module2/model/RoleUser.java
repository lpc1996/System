package com.lpc.module2.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */

/**
    * role_user
    */
@Data
public class RoleUser {
    /**
    * 主键
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
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