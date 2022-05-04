package com.lpc.module1.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @package:com.lpc.demo1.pojo
 * @Author:旁观者
 * @Date:2022/2/28-12:49
 * @By:IntelliJ IDEA
 * @FileName:JqGridListForm.java
 */
@Data
public class JqGridListForm implements Serializable {
    private static final long serialVersionUID = 1L;

    /* 当前页数 */
    private int page;
    /* 总页数 */
    private int total;

    /* 总计录数  */
    private long records;

    private List<?> formList;
}
