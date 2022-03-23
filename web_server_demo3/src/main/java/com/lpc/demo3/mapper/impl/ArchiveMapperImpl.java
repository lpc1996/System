package com.lpc.demo3.mapper.impl;

import com.lpc.demo3.mapper.ArchiveMapper;
import com.lpc.demo3.mapper.Mapper;
import com.lpc.demo3.model.Archive;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @package:com.lpc.mapper.impl
 * @Author:旁观者
 * @Date:2022/2/13-16:53
 * @FileName:ArchiveMapperImpl.java
 */
@Repository
public class ArchiveMapperImpl extends SqlSessionDaoSupport implements ArchiveMapper, Mapper {

    @Autowired(required = false)
    @Qualifier("sqlSessionTemplate")
    public void setSqlSessionTemplate(SqlSessionTemplate sessionTemplate){
        super.setSqlSessionTemplate(sessionTemplate);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Archive record) {
        return getMapper().insert(record);
    }

    @Override
    public int insertSelective(Archive record) {
        return getMapper().insertSelective(record);
    }

    @Override
    public Archive selectByPrimaryKey(String id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Archive record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Archive record) {
        return getMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<Archive> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public int selectCount() {
        return getMapper().selectCount();
    }

    @Override
    public ArchiveMapper getMapper() {
        return getSqlSession().getMapper(ArchiveMapper.class);
    }
}
