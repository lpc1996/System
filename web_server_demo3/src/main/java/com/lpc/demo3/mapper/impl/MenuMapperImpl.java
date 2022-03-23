package com.lpc.demo3.mapper.impl;

import com.lpc.demo3.mapper.Mapper;
import com.lpc.demo3.mapper.MenuMapper;
import com.lpc.demo3.model.Menu;
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
public class MenuMapperImpl extends SqlSessionDaoSupport implements MenuMapper, Mapper {

    @Autowired(required = false)
    @Qualifier("sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sessionTemplate){
        super.setSqlSessionTemplate(sessionTemplate);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Menu record) {
        return getMapper().insert(record);
    }

    @Override
    public int insertSelective(Menu record) {
        return getMapper().insertSelective(record);
    }

    @Override
    public Menu selectByPrimaryKey(Long id) {
        return getMapper().selectByPrimaryKey(id);
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public List<Menu> selectByUserId(String userId) {
        return getMapper().selectByUserId(userId);
    }

    /**
     * @return
     */
    @Override
    public List<Menu> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public int selectCount() {
        return getMapper().selectCount();
    }

    @Override
    public int updateByPrimaryKeySelective(Menu record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Menu record) {
        return getMapper().updateByPrimaryKey(record);
    }

    @Override
    public MenuMapper getMapper() {
        return getSqlSession().getMapper(MenuMapper.class);
    }
}
