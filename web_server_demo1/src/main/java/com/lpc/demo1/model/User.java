package com.lpc.demo1.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */

/**
    * user
    */
@Data
public class User{
    /**
    * 用户名
    */
    private String id;

    /**
    * 昵称
    */
    private String name;

    /**
     * 头像地址
     */
//    @Column(name = "img_url")
    private String imgUrl;

    /**
    * 密码
    */
    private String pass;

    /**
    * 创建时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd  hh:mm:ss")
    private Date createTime;

    /**
    * 用户状态
    */
    private String status;

}