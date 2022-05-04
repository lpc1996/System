package com.lpc.module1.mapper.impl;

import com.lpc.module1.mapper.UserMapper;
import org.springframework.stereotype.Repository;

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
}
