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
    * role
    */
@Data
@Table(name = "role")
public class Role {
    /**
    * 主键
    */
    @Id
    @GeneratedValue(generator = "JDBC")
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