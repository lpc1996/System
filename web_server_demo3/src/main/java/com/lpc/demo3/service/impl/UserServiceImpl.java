package com.lpc.demo3.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.demo3.mapper.ArchiveMapper;
import com.lpc.demo3.mapper.UserMapper;
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
    private ArchiveMapper archiveMapper;


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
    public List<User> getUsersByPage(Integer pageId, Integer size) {
        PageHelper.startPage(pageId,size);
        List<User> users = userMapper.selectAll();
        return users;
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


    public Integer getCount(User record) {
        Integer count=0;
        if(record == null){
            count = userMapper.selectCount();
        }
        return count;
    }

    @Override
    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        PageHelper.startPage(pageId,pageSize);
        List<User> userList = userMapper.selectAll();
        return createJqGridListForm(userList,getCount(null),pageId,pageSize);
    }
}
