package com.lpc.mybatis.mapper.impl;

import com.lpc.mybatis.mapper.Mapper;
import com.lpc.mybatis.mapper.MenuMapper;
import com.lpc.model.Menu;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public class MenuMapperImpl extends SqlSessionDaoSupport implements MenuMapper, Mapper {
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
