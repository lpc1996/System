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
    * 数据字典
    */
@Data
@EqualsAndHashCode(callSuper=true)
@Table(name = "sys_dict")
public class SysDict extends MyModel {
    /**
     * 主键
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 字典名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 字典类型
     */
    @Column(name = "`type`")
    private String type;

    /**
     * 字典码
     */
    @Column(name = "code")
    private Integer code;

    /**
     * 字典值
     */
    @Column(name = "`value`")
    private String value;

    /**
     * 字典状态
     */
    @Column(name = "`status`")
    private Integer status;

    /**
     * 最后更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}