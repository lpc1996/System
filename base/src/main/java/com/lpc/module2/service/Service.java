package com.lpc.module2.service;

import com.lpc.module2.pojo.JqGridListForm;
import com.lpc.module2.pojo.Pagination;

/**
 * @package:com.lpc.demo1.service
 * @Author:旁观者
 * @Date:2022/2/17-10:13
 * @By:IntelliJ IDEA
 * @FileName:Service.java
 */
public interface Service {

    JqGridListForm findByPage(Pagination pagination);

}
