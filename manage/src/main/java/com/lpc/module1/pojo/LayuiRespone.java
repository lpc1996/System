package com.lpc.module1.pojo;

import com.lpc.module1.model.MyModel;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * layui表格插件数据结构
 * @package:com.lpc.module1.pojo
 * @Author:旁观者
 * @Date:2022/5/6-12:38
 * @By:IntelliJ IDEA
 * @FileName:LayuiRespone.java
 */

@Data
public class LayuiRespone <T extends MyModel> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer code = 0;

    private String message;

    private Integer count;

    private List<T> data;
}
