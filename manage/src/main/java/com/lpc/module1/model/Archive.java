package com.lpc.module1.model;

import javax.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @package:com.lpc.module1.model
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 * archive
 */

@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "archive")
public class Archive extends MyModel {
    /**
     * 学/工号
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 姓名
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 年龄
     */
    @Column(name = "age")
    private Integer age;

    /**
     * 性别
     */
    @Column(name = "sex")
    private String sex;

    /**
     * 账户类型
     */
    @Column(name = "`type`")
    private String type;

    /**
     * 政治面貌
     */
    @Column(name = "politic")
    private String politic;

    /**
     * 民族
     */
    @Column(name = "nation")
    private String nation;
}