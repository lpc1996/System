package com.lpc.module1.mapper.impl;

import com.lpc.module1.mapper.UserMapper;
import com.lpc.module1.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @package:com.lpc.module1.mapper.impl
 * @Author:旁观者
 * @Date:2022/5/4-15:10
 * @By:IntelliJ IDEA
 * @FileName:UserMapperImpl.java
 */
@Repository
public class UserMapperImpl extends MyMapperImpl<UserMapper> implements UserMapper{
    @Override
    public int ifNullByPrimaryKey(String id) {
        return getMapper(UserMapper.class).ifNullByPrimaryKey(id);
    }

    @Override
    public int ifNullByPrimaryKeyAndPass(String id, String pass) {
        return getMapper(UserMapper.class).ifNullByPrimaryKeyAndPass(id,pass);
    }

    @Override
    public int updatePassByIdAndOldPass(String id, String oldPass, String newPass) {
        return getMapper(UserMapper.class).updatePassByIdAndOldPass(id,oldPass,newPass);
    }

    @Override
    public List<User> selectWithLike(User record) {
        return getMapper(UserMapper.class).selectWithLike(record);
    }

    /**
     * 获取like模糊查询的总数
     *
     * @param record
     * @return
     */
    @Override
    public int selectCountWithLike(User record) {
        return getMapper(UserMapper.class).selectCountWithLike(record);
    }
}
