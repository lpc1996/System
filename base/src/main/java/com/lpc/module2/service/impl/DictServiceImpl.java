package com.lpc.module2.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.module2.mapper.SysDictMapper;
import com.lpc.module2.mapper.tkMapper.SysDictMapperTk;
import com.lpc.module2.model.SysDict;
import com.lpc.module2.pojo.JqGridListForm;
import com.lpc.module2.pojo.Pagination;
import com.lpc.module2.service.DictService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

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
    private SysDictMapper sysDictMapper;
    @Resource
    private SysDictMapperTk sysDictMapperTk;

    public  Integer getCount(SysDict record) {
        Integer count = 0;
        if(record == null){
            count = sysDictMapperTk.selectCount(record);
        }
        return count;
    }

    @Override
    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        Example example = new Example(SysDict.class);
        example.setOrderByClause(StringUtil.camelhumpToUnderline(pagination.getSidx())+" "+pagination.getSord());
        PageHelper.startPage(pageId,pageSize);
        List<SysDict> dictList = sysDictMapperTk.selectByExample(example);
        return createJqGridListForm(dictList,getCount(null),pageId,pageSize);
    }

    @Override
    public boolean addDict(SysDict record) {
        return sysDictMapperTk.insert(record) == 1? true: false;
    }

    public boolean updateDict(SysDict record){
        return sysDictMapperTk.updateByPrimaryKey(record) == 1? true: false;
    }

    public boolean delDict(SysDict sysDict){
        return sysDictMapperTk.delete(sysDict) == 1 ? true : false;
    }
}
