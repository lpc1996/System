package com.lpc.demo1.service.impl;

import com.github.pagehelper.PageHelper;
import com.lpc.demo1.mapper.ArchiveMapper;
import com.lpc.demo1.mapper.UserMapper;
import com.lpc.demo1.model.Archive;
import com.lpc.demo1.model.User;
import com.lpc.demo1.pojo.JqGridListForm;
import com.lpc.demo1.pojo.JsGridRequest;
import com.lpc.demo1.pojo.JsGridRespone;
import com.lpc.demo1.pojo.Pagination;
import com.lpc.demo1.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
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

//    @Override
//    public List findByPage(int page, int pageSize) {
//        PageHelper.startPage(page,pageSize);
//        List<User> users = userMapper.selectAll();
//        return users;
//    }

    public Integer getCount(User record) {
        return userMapper.selectCount(record);
    }

    @Override
    public JqGridListForm findByPage(Pagination pagination) {
        int pageId = pagination.getPage() <= 0? 1:pagination.getPage();
        int pageSize = pagination.getRows() <= 0? 20: pagination.getRows();
        PageHelper.startPage(pageId,pageSize);
        List<User> userList = userMapper.selectAll();
        return createJqGridListForm(userList,getCount(null),pageId,pageSize);
    }

//    public DataTablesOutput<User> findByPage(DataTablesInput dataTablesInput){
//        DataTablesOutput<User> out = new DataTablesOutput<>();
//        PageHelper.offsetPage(dataTablesInput.getStart(),dataTablesInput.getLength());
//        List<User> users = userMapper.selectAll();
//        out.setDraw(dataTablesInput.getDraw()+1);
//        out.setData(users);
//        out.setRecordsTotal(getCount(null));
//        out.setRecordsFiltered(getCount(null));
//        return out;
//    }

    public JsGridRespone findByPage(JsGridRequest jsGrid) {
        JsGridRespone jsGridRespone = new JsGridRespone();
        PageHelper.startPage(jsGrid.getPageIndex(),jsGrid.getPageSize());
        List<User> users = userMapper.selectAll();
        jsGridRespone.setData(users);
        jsGridRespone.setItemsCount(users.size());
        return jsGridRespone;
    }
}
