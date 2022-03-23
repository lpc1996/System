package com.lpc.demo1.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @package:com.lpc.demo1.pojo
 * @Author:旁观者
 * @Date:2022/2/28-12:59
 * @By:IntelliJ IDEA
 * @FileName:Pagination.java
 */
@Data
public class Pagination implements Serializable {
    /**
     * 每页行数
     */
    private int rows;
    /**
     * 当前页
     */
    private int page;

    /**
     * 排序列
     */
    private String sidx;
    /**
     * 排序类型
     */
    private String sord;
    /**
     * 总记录数
     */
    private int records;

    /**
     *
     */
//    private boolean search;
//
//    private String filters;
}
