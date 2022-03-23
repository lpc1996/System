package com.lpc.service.impl;

import com.lpc.mapper.impl.ArchiveMapperImpl;
import com.lpc.mapper.impl.UserMapperImpl;
import com.lpc.model.Archive;
import com.lpc.model.User;
import com.lpc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserMapperImpl userMapper;
    private ArchiveMapperImpl archiveMapper;

    public UserServiceImpl(@Qualifier("userMapperImpl") UserMapperImpl userMapper,@Qualifier("archiveMapperImpl")ArchiveMapperImpl archiveMapper) {
        this.userMapper = userMapper;
        this.archiveMapper = archiveMapper;
    }

    @Override
    public boolean login(String userName, String password) {
        if(userMapper.ifNullByPrimaryKeyAndPass(userName,password) == 1){
            return true;
        }
        return false;
    }

    @Override
    public User getUser(String userName) {
        return userMapper.selectByPrimaryKey(userName);
    }

    @Override
    public Archive getArchive(String id) {
        return archiveMapper.selectByPrimaryKey(id);
    }


    @Override
    public List<User> getAllUsers() {
        return userMapper.selectAll();
    }

    @Override
    public boolean updatePass(String userName, String oldPass, String newPass) {
        return userMapper.updatePassByIdAndOldPass(userName, oldPass, newPass) == 1;
    }

    @Override
    public boolean regsiter(User user,String pass) {
        return userMapper.insert(user,pass) == 1;
    }

    @Override
    public boolean updateUserName(String userName, String id) {
        return userMapper.updateNameById(userName,id) == 1;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateByPrimaryKey(user) == 1;
    }
}
