package com.lpc.demo3.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.demo3.mapper.RoleMapper;
import com.lpc.demo3.mapper.tkMapper.RoleMapperTk;
import com.lpc.demo3.model.Role;
import com.lpc.demo3.pojo.JqGridListForm;
import com.lpc.demo3.pojo.Pagination;
import com.lpc.demo3.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @package:com.lpc.demo1.service.impl
 * @Author:旁观者
 * @Date:2022/2/17-10:12
 * @By:IntelliJ IDEA
 * @FileName:RoleServiceImpl.java
 */
@Service
@Transactional
public class RoleServiceImpl extends MyService implements RoleService {

    @Resource
    private RoleMapper roleMapper;
    @Resource
    private RoleMapperTk roleMapperTk;

    public Integer getCount(Role record) {
        Integer count = 0;
        if(record == null){
            count = roleMapperTk.selectCount(record);
        }
        return count;
    }

    @Override
    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        PageHelper.startPage(pageId,pageSize);
        List<Role> roleList = roleMapperTk.selectAll();
        return createJqGridListForm(roleList,getCount(null),pageId,pageSize);
    }
}
