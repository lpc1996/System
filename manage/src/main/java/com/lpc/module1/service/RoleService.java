package com.lpc.module1.service;

import com.lpc.module1.mapper.tk.RoleMapperTk;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lpc.module1.mapper.RoleMapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * @package:com.lpc.module1.service
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 */

@Service
@Transactional
public class RoleService{

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private RoleMapperTk roleMapperTk;

}
