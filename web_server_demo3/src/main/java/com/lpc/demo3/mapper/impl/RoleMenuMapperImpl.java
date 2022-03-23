package com.lpc.demo3.mapper.impl;

import com.lpc.demo3.mapper.Mapper;
import com.lpc.demo3.mapper.RoleMenuMapper;
import com.lpc.demo3.model.RoleMenu;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
@Repository
public class RoleMenuMapperImpl extends SqlSessionDaoSupport implements RoleMenuMapper, Mapper {

    @Autowired(required = false)
    @Qualifier("sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sessionTemplate){
        super.setSqlSessionTemplate(sessionTemplate);
    }

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
    public List<RoleMenu> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public int selectCount() {
        return getMapper().selectCount();
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
