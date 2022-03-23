package com.lpc.mybatis.mapper.impl;

import com.lpc.mybatis.mapper.Mapper;
import com.lpc.mybatis.mapper.UserMapper;
import com.lpc.model.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper, Mapper {
    @Override
    public UserMapper getMapper() {
        return getSqlSession().getMapper(UserMapper.class);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return getMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return getMapper().insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return getMapper().insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return getMapper().selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return getMapper().selectAll();
    }

    @Override
    public int ifNullByPrimaryKey(String id) {
        return getMapper().ifNullByPrimaryKey(id);
    }

    @Override
    public int ifNullByPrimaryKeyAndPass(String id, String pass) {
        return getMapper().ifNullByPrimaryKeyAndPass(id,pass);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return getMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return getMapper().updateByPrimaryKey(record);
    }

    @Override
    public int updatePassByIdAndOldPass(String id, String oldPass, String newPass) {
        return getMapper().updatePassByIdAndOldPass(id,oldPass,newPass);
    }
}
