package com.lpc.mybatis.mapper.impl;

import com.lpc.util.SpringUtil;
import org.junit.Test;


/**
 * @author 濃霧-遠方
 * @date 2021/12/30
 */
public class MenuMapperImplTest {

    @Test
    public void selectByUserId() {
        MenuMapperImpl menuMapper = (MenuMapperImpl) SpringUtil.getApplicationContext().getBean("menuMapper");
        System.out.println(menuMapper.selectByUserId("07161075"));
    }
}