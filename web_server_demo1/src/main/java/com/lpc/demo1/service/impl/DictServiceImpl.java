package com.lpc.demo1.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.demo1.mapper.DictMapper;
import com.lpc.demo1.model.Dict;
import com.lpc.demo1.pojo.JqGridListForm;
import com.lpc.demo1.pojo.Pagination;
import com.lpc.demo1.service.DictService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @package:com.lpc.demo1.service.impl
 * @Author:旁观者
 * @Date:2022/2/21-10:45
 * @By:IntelliJ IDEA
 * @FileName:DictServiceImpl.java
 */
@Service
@Transactional
public class DictServiceImpl extends MyService implements DictService {

    @Resource
    private DictMapper dictMapper;

    public  Integer getCount(Dict record) {
        return dictMapper.selectCount(record);
    }

    @Override
    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        PageHelper.startPage(pageId,pageSize);
        List<Dict> dictList = dictMapper.selectAll();
        return createJqGridListForm(dictList,getCount(null),pageId,pageSize);
    }
}
