package com.lpc.mybatis.model;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
/**
    * user
    */
@Data
public class User {
    /**
    * 用户名
    */
    private String id;

    /**
    * 昵称
    */
    private String name;

    /**
    * 密码
    */
    private String pass;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 用户状态
    */
    private String status;
}