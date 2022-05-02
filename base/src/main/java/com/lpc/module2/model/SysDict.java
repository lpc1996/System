package com.lpc.module2.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
@package:com.lpc.demo3.model
@Author:旁观者
@Date:2022/4/8-10:51
@By:IntelliJ IDEA
*/
/**
 * 数据字典
 */
@Data
@Table(name = "sys_dict")
public class SysDict {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Long id;

    /**
     * 字典名称
     */
    private String name;

    /**
     * 字典类型
     */
    private String type;

    /**
     * 字典码
     */
    private Integer code;

    /**
     * 字典值
     */
    private String value;

    /**
     * 字典状态
     */
    private Integer status;

    /**
     * 最后更新时间
     */
    private Date updateTime;
}