package com.lpc.mybatis.mapper.impl;

import com.lpc.mybatis.mapper.Mapper;
import com.lpc.mybatis.mapper.RoleMenuMapper;
import com.lpc.model.RoleMenu;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public class RoleMenuMapperImpl extends SqlSessionDaoSupport implements RoleMenuMapper, Mapper {
    @Override
    public RoleMenuMapper getMapper() {
        return getSqlSession().getMapper(RoleMenuMapper.class);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RoleMenu record) {
        return getMapper().insert(record);
    }

    @Override
    public int insertSelective(RoleMenu record) {
        return getMapper().insertSelective(record);
    }

    @Override
    public RoleMenu selectByPrimaryKey(Long id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleMenu record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleMenu record) {
        return getMapper().updateByPrimaryKey(record);
    }
}
