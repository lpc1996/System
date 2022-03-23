package com.lpc.model;

import lombok.Data;

import java.util.Date;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */

/**
    * dict
    */
@Data
public class Dict {
    /**
    * 主键
    */
    private Long id;

    /**
    * 表名
    */
    private String tableName;

    /**
    * 列名
    */
    private String columnName;

    /**
    * 类型代码
    */
    private String typeCode;

    /**
    * 类型名称
    */
    private String typeName;

    /**
    * 数据数值
    */
    private Integer valueId;

    /**
    * 数据名称
    */
    private String valueName;

    /**
    * 类型状态
    */
    private Byte status;

    /**
    * 最后修改时间
    */
    private Date updateTime;
}