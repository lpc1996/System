package com.lpc.demo1.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @package:com.lpc.demo1.pojo
 * @Author:旁观者
 * @Date:2022/3/13-11:30
 * @By:IntelliJ IDEA
 * @FileName:JsGridRespone.java
 */
@Data
public class JsGridRespone implements Serializable {

    private static final long serialVersionUID = 1L;

    //数据
    private List data;

    //行数
    private Integer itemsCount;

}
