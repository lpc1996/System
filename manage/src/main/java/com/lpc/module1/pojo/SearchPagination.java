package com.lpc.module1.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @package:com.lpc.demo3.pojo
 * @Author:旁观者
 * @Date:2022/4/28-22:56
 * @By:IntelliJ IDEA
 * @FileName:SearchPagination.java
 */
@Data
public class SearchPagination implements Serializable {

    private static final long serialVersionUID = 1L;

    private String _search;

    private String searchVal;
}
