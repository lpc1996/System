package com.lpc.module2.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author 濃霧-遠方
 * @date 20
 * @21/11/8
 */

@Data
@Table(name = "user")
public class User{
    /**
    * 用户名
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
    * 昵称
    */
    private String name;

    /**
     * 头像地址
     */
    private String imgUrl;

    /**
    * 密码
    */
    private String pass;

    /**
    * 创建时间
    */
//    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    /**
    * 用户状态
    */
    private String status;

}