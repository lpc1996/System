package com.lpc.module1.mapper.impl;

import com.lpc.module1.mapper.MyMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @package:com.lpc.module1.mapper.impl
 * @Author:旁观者
 * @Date:2022/5/4-14:54
 * @By:IntelliJ IDEA
 * @FileName:MyMapperImpl.java
 */
public class MyMapperImpl <T extends MyMapper> extends SqlSessionDaoSupport {

    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate){
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    protected T getMapper(Class<T> tClass){
        return getSqlSession().getMapper(tClass);
    }
}
