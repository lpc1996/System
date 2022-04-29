package com.lpc.demo3.mapper.impl;

import com.lpc.demo3.mapper.MyMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @package:com.lpc.demo3.mapper.impl
 * @Author:旁观者
 * @Date:2022/4/8-10:59
 * @By:IntelliJ IDEA
 * @FileName:MyMapper.java
 */
@Repository
public class MyMapperImpl<T extends MyMapper> extends SqlSessionDaoSupport {

    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    public T getMapper(Class<T> tClass){
        return getSqlSession().getMapper(tClass);
    }
}
