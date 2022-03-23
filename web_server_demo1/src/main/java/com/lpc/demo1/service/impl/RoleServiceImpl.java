package com.lpc.demo1.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.demo1.mapper.RoleMapper;
import com.lpc.demo1.pojo.JqGridListForm;
import com.lpc.demo1.pojo.Pagination;
import com.lpc.demo1.service.RoleService;
import com.lpc.demo1.model.Role;
import com.lpc.demo1.model.User;
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

    public Integer getCount(Role record) {
        return roleMapper.selectCount(record);
    }

    @Override
    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        PageHelper.startPage(pageId,pageSize);
        List<Role> roleList = roleMapper.selectAll();
        return createJqGridListForm(roleList,getCount(null),pageId,pageSize);
    }
}
