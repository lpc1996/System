package com.lpc.mybatis.mapper.impl;

import com.lpc.mybatis.mapper.Mapper;
import com.lpc.mybatis.mapper.RoleMapper;
import com.lpc.model.Role;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public class RoleMapperImpl extends SqlSessionDaoSupport implements RoleMapper, Mapper {
    @Override
    public RoleMapper getMapper() {
        return getSqlSession().getMapper(RoleMapper.class);
    }


    @Override
    public int deleteByPrimaryKey(Long id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Role record) {
        return getMapper().insert(record);
    }

    @Override
    public int insertSelective(Role record) {
        return getMapper().insertSelective(record);
    }

    @Override
    public Role selectByPrimaryKey(Long id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Role record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Role record) {
        return getMapper().updateByPrimaryKey(record);
    }
}
