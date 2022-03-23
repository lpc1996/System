package com.lpc.demo1.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @package:com.lpc.demo1.pojo
 * @Author:旁观者
 * @Date:2022/3/13-11:29
 * @By:IntelliJ IDEA
 * @FileName:JsGridRequest.java
 */
@Data
public class JsGridRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页码
     */
    private Integer pageIndex;

    //页面行数
    private Integer pageSize;

    //排序字段
    private String sortField;

    //排序顺序为字符串“asc”|“desc”
    private String sortOrder;
}
