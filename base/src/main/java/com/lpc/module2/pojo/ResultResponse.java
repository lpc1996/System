package com.lpc.module2.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @package:com.lpc.demo3.pojo
 * @Author:旁观者
 * @Date:2022/3/22-16:58
 * @By:IntelliJ IDEA
 * @FileName:ResultResponse.java
 */
@Data
public class ResultResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean message;
    private Integer id;
}
