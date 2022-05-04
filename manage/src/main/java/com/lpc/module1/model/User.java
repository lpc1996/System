package com.lpc.module1.model;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;



/**
 * @package:com.lpc.module1.model
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 * user
 */
@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "`user`")
public class User extends MyModel {
    /**
     * 用户名
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 昵称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 头像地址
     */
    @Column(name = "img_url")
    private String imgUrl;

    /**
     * 密码
     */
    @Column(name = "pass")
    private String pass;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 用户状态
     */
    @Column(name = "`status`")
    private String status;
}