package com.lpc.mybatis.mapper.impl;

import com.lpc.mybatis.mapper.Mapper;
import com.lpc.mybatis.mapper.RoleUserMapper;
import com.lpc.model.RoleUser;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public class RoleUserMapperImpl extends SqlSessionDaoSupport implements RoleUserMapper, Mapper {
    @Override
    public RoleUserMapper getMapper() {
        return getSqlSession().getMapper(RoleUserMapper.class);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(RoleUser record) {
        return getMapper().insert(record);
    }

    @Override
    public int insertSelective(RoleUser record) {
        return getMapper().insertSelective(record);
    }

    @Override
    public RoleUser selectByPrimaryKey(Long id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(RoleUser record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(RoleUser record) {
        return getMapper().updateByPrimaryKey(record);
    }
}
