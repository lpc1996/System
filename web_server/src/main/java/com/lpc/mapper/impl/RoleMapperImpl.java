package com.lpc.mapper.impl;

import com.lpc.mapper.Mapper;
import com.lpc.mapper.RoleMapper;
import com.lpc.model.Role;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
@Repository
public class RoleMapperImpl extends SqlSessionDaoSupport implements RoleMapper, Mapper {

    @Autowired(required = false)
    @Qualifier("sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sessionTemplate){
        super.setSqlSessionTemplate(sessionTemplate);
    }

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
