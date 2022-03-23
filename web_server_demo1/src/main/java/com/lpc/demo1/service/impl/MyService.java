package com.lpc.demo1.service.impl;

import com.lpc.demo1.pojo.JqGridListForm;
import com.lpc.demo1.pojo.Pagination;

import java.util.List;

/**
 * @package:com.lpc.demo1.service.impl
 * @Author:旁观者
 * @Date:2022/2/28-18:31
 * @By:IntelliJ IDEA
 * @FileName:MyService.java
 */
public class MyService {
    protected JqGridListForm createJqGridListForm(List<?> records,int count,int pageId,int pageSize){
        JqGridListForm jqGridListForm = new JqGridListForm();
        jqGridListForm.setFormList(records);
        int total = count/pageSize;
        if(total % pageSize != 0){
            total++;
        }else if(total == 0){
            total++;
        }
        jqGridListForm.setTotal(total);
        jqGridListForm.setPage(Math.min(total,pageId));
        jqGridListForm.setRecords(count);
        return jqGridListForm;
    }
}
