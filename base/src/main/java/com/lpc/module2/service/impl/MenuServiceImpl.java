package com.lpc.module2.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.module2.mapper.MenuMapper;
import com.lpc.module2.mapper.tkMapper.MenuMapperTk;
import com.lpc.module2.model.Menu;
import com.lpc.module2.pojo.JqGridListForm;
import com.lpc.module2.pojo.Pagination;
import com.lpc.module2.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @package:com.lpc.demo3.service.impl
 * @Author:旁观者
 * @Date:2022/3/21-15:49
 * @By:IntelliJ IDEA
 * @FileName:MenuServiceImpl.java
 */
@Service
public class MenuServiceImpl extends MyService implements MenuService {

    @Resource
    private MenuMapper menuMapper;
    @Resource
    private MenuMapperTk menuMapperTk;

    @Override
    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        PageHelper.startPage(pageId,pageSize);
        List menuList = menuMapperTk.selectAll();
        JqGridListForm jqGridListForm = createJqGridListForm(menuList,
                menuMapperTk.selectCount(null),pageId,pageSize);
        return jqGridListForm;
    }

    @Override
    public List<Menu> getUserMenu(String userId){
        List<Menu> menuList = menuMapper.selectByUserId(userId);
        return menuList;
    }
}
