package com.lpc.module1.service;

import com.lpc.module1.mapper.tk.UserMapperTk;
import com.lpc.module1.pojo.UserForm;
import com.lpc.module1.util.RandomCodeUtil;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lpc.module1.mapper.UserMapper;
import org.springframework.transaction.annotation.Transactional;

/**
 * @package:com.lpc.module1.service
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 */

@Service
@Transactional
public class UserService{

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
}
