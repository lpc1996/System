package com.lpc.module1.service;

import com.github.pagehelper.PageHelper;
import com.lpc.module1.mapper.tk.UserMapperTk;
import com.lpc.module1.model.User;
import com.lpc.module1.pojo.LayuiRequest;
import com.lpc.module1.pojo.LayuiRespone;
import com.lpc.module1.pojo.UserForm;
import com.lpc.module1.util.CommonParams;
import com.lpc.module1.util.CookUtil;
import com.lpc.module1.util.RandomCodeUtil;
import com.lpc.module1.util.TokenUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lpc.module1.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @package:com.lpc.module1.service
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 */

@Service
@Transactional
public class UserService extends MyService<User>{

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserMapperTk userMapperTk;

    public boolean checkPass(String userId,String pass){
        return userMapper.ifNullByPrimaryKeyAndPass(userId,pass) == 1;
    }

    public boolean updatePass(String userId,String oldPass,String newPass){
        return userMapper.updatePassByIdAndOldPass(userId,oldPass,newPass) == 1;
    }

    public boolean checkPass(UserForm userForm) {
        if (!RandomCodeUtil.checkCode(userForm.getRandomCode())){
            return false;
        }else if(!(userMapper.ifNullByPrimaryKeyAndPass(userForm.getUserId(),userForm.getPassword()) == 1)){
            return false;
        }
        return true;
    }

    public LayuiRespone<User> list(LayuiRequest<User> request){
        LayuiRespone<User> respone = null;
        int page = request.getPage() > 0 ? request.getPage() :1;
        int nums = request.getNums() > 0 ?request.getNums() :10;
        User user = request.getSearchParams();
        List<User> userList = null;
        int count = 0;
        if(user == null){
            PageHelper.startPage(page,nums);
            userList = userMapperTk.selectAll();
            count = userMapperTk.selectCount(null);
        }else{
            PageHelper.startPage(page,nums);
            userList = userMapper.selectWithLike(user);
            count = userMapper.selectCountWithLike(user);
        }
        if(userList.size() > 0){
            respone = createLayuiResponse(200,"成功",count,userList);
        }else{
            respone = createLayuiResponse(0,"数据库中没有查询的数据",0,null);
        }
        return respone;
    }

    public boolean insertOrUpdate(int option,User record){
        if(option == 1){
            return insert(record);
        }else if(option == 2){
            return update(record);
        }
        return false;
    }

    public boolean insert(User record){
        return userMapperTk.insert(record) ==1;
    }

    public boolean update(User record){
        return userMapperTk.updateByPrimaryKey(record) == 1;
    }

    public boolean del(User record){
        return userMapperTk.delete(record) == 1;
    }
}
