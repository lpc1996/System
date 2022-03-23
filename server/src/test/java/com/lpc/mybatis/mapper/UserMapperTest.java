package com.lpc.mybatis.mapper;

import com.lpc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public class UserMapperTest {

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
        SqlSession session = MyBatisUtil.getSqlSession();
        session.getMapper(UserMapper.class).selectByPrimaryKey("1");
        session.close();
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
    }
}