package com.lpc.demo3.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.demo3.mapper.ArchiveMapper;
import com.lpc.demo3.mapper.UserMapper;
import com.lpc.demo3.mapper.tkMapper.ArchiveMapperTk;
import com.lpc.demo3.mapper.tkMapper.UserMapperTk;
import com.lpc.demo3.model.Archive;
import com.lpc.demo3.model.User;
import com.lpc.demo3.pojo.JqGridListForm;
import com.lpc.demo3.pojo.Pagination;
import com.lpc.demo3.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl extends MyService implements UserService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserMapperTk userMapperTk;
    @Resource
    private ArchiveMapper archiveMapper;
    @Resource
    private ArchiveMapperTk archiveMapperTk;

    @Override
    public boolean login(String userName, String password) {
        if(userMapper.ifNullByPrimaryKeyAndPass(userName,password) == 1){
            return true;
        }
        return false;
    }

    @Override
    public User getUser(String userName) {
        return userMapperTk.selectByPrimaryKey(userName);
    }

    @Override
    public Archive getArchive(String id) {
        return archiveMapperTk.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapperTk.selectAll();
    }

    @Override
    public List<User> getUsersByPage(Integer pageId, Integer size) {
        PageHelper.startPage(pageId,size);
        List<User> users = userMapperTk.selectAll();
        return users;
    }

    @Override
    public boolean updatePass(String userName, String oldPass, String newPass) {
        return userMapper.updatePassByIdAndOldPass(userName, oldPass, newPass) == 1;
    }

    @Override
    public boolean regsiter(User user,String pass) {
        user.setPass(pass);
        return userMapperTk.insert(user) == 1;
    }

    @Override
    public boolean updateUserName(String userName, String id) {
        return userMapper.updateNameById(userName,id) == 1;
    }

    @Override
    public boolean updateUser(User user) {
        return userMapperTk.updateByPrimaryKey(user) == 1;
    }

    public Integer getCount(User record) {
        Integer count=0;
        if(record == null){
            count = userMapperTk.selectCount(record);
        }
        return count;
    }

    @Override
    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        PageHelper.startPage(pageId,pageSize);
        List<User> userList = userMapperTk.selectAll();
        return createJqGridListForm(userList,getCount(null),pageId,pageSize);
    }
}
