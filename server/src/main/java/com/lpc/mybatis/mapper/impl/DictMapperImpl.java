package com.lpc.mybatis.mapper.impl;

import com.lpc.mybatis.mapper.DictMapper;
import com.lpc.mybatis.mapper.Mapper;
import com.lpc.model.Dict;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public class DictMapperImpl extends SqlSessionDaoSupport implements DictMapper, Mapper {


    @Override
    public int deleteByPrimaryKey(Long id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Dict record) {
        return getMapper().insert(record);
    }

    @Override
    public int insertSelective(Dict record) {
        return getMapper().insertSelective(record);
    }

    @Override
    public Dict selectByPrimaryKey(Long id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public List<Dict> selectByTableNameAndColumnName(String tableName, String columnName) {
        return getMapper().selectByTableNameAndColumnName(tableName,columnName);
    }

    @Override
    public int updateByPrimaryKeySelective(Dict record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Dict record) {
        return getMapper().updateByPrimaryKey(record);
    }

    @Override
    public  DictMapper getMapper() {
        return getSqlSession().getMapper(DictMapper.class);
    }
}
