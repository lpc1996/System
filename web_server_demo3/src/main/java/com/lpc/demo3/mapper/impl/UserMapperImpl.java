package com.lpc.demo3.mapper.impl;

import com.lpc.demo3.mapper.UserMapper;
import com.lpc.demo3.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
@Repository
public class UserMapperImpl extends MyMapperImpl<UserMapper> implements UserMapper {


    @Override
    public int insert(User record,String pass) {
        return getMapper(UserMapper.class).insert(record,pass);
    }

    @Override
    public int insertSelective(User record,String pass) {
        return getMapper(UserMapper.class).insertSelective(record,pass);
    }

    @Override
    public int ifNullByPrimaryKey(String id) {
        return getMapper(UserMapper.class).ifNullByPrimaryKey(id);
    }

    @Override
    public int ifNullByPrimaryKeyAndPass(String id, String pass) {
        return getMapper(UserMapper.class).ifNullByPrimaryKeyAndPass(id,pass);
    }

    @Override
    public int updateByPrimaryKeySelective(User record,String pass) {
        return getMapper(UserMapper.class).updateByPrimaryKeySelective(record,pass);
    }

    @Override
    public int updatePassByIdAndOldPass(String id, String oldPass, String newPass) {
        return getMapper(UserMapper.class).updatePassByIdAndOldPass(id,oldPass,newPass);
    }

    @Override
    public int updateNameById(String updatedName, String id) {
        return getMapper(UserMapper.class).updateNameById(updatedName,id);
    }
}
