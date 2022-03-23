package com.lpc.demo3.model;

import lombok.Data;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */

/**
    * role
    */
@Data
public class Role {
    /**
    * 主键
    */
    private Long id;

    /**
    * 角色名称
    */
    private String name;

    /**
    * 角色描述
    */
    private String info;
}