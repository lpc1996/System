package com.lpc.mapper.impl;

import com.lpc.util.SpringUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserMapperImplTest {

    UserMapperImpl userMapper;

    @Before
    public void init(){
        userMapper = SpringUtil.getApplicationContext().getBean("userMapperImpl",UserMapperImpl.class);
    }

    @Test
    public void getMapper() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void ifNullByPrimaryKey() {
    }

    @Test
    public void ifNullByPrimaryKeyAndPass() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void updatePassByIdAndOldPass() {
        System.out.println(userMapper.updatePassByIdAndOldPass("07161075","xx1602614lpc","1602614lpc"));
    }
}