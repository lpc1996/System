package com.lpc.demo3.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
@Data
public class Role {
    /**
    * 主键
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
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