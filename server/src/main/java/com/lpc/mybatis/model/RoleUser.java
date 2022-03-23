package com.lpc.mybatis.model;

import lombok.Data;

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