package com.lpc.module1.mapper.impl;

import com.lpc.module1.mapper.MyMapper;
import com.lpc.module1.mapper.SysMenuMapper;
import com.lpc.module1.model.SysMenu;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @package:com.lpc.module1.mapper.impl
 * @Author:旁观者
 * @Date:2022/5/4-15:36
 * @By:IntelliJ IDEA
 * @FileName:SysMenuMapperImpl.java
 */
@Repository
public class SysMenuMapperImpl extends MyMapperImpl<SysMenuMapper> implements SysMenuMapper {
    @Override
    public List<SysMenu> selectByUserId(String userId) {
        return getMapper(SysMenuMapper.class).selectByUserId(userId);
    }
}
