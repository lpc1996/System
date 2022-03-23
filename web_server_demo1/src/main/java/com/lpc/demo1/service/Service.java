package com.lpc.demo1.service;

import com.lpc.demo1.model.User;
import com.lpc.demo1.pojo.JqGridListForm;
import com.lpc.demo1.pojo.Pagination;

import java.util.List;

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
