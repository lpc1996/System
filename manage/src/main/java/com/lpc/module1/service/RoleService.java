package com.lpc.module1.service;

import com.github.pagehelper.PageHelper;
import com.lpc.module1.mapper.tk.RoleMapperTk;
import com.lpc.module1.model.Role;
import com.lpc.module1.pojo.LayuiRequest;
import com.lpc.module1.pojo.LayuiRespone;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lpc.module1.mapper.RoleMapper;
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
public class RoleService extends MyService<Role>{

//    @Resource
//    private RoleMapper roleMapper;

    @Resource
    private RoleMapperTk roleMapperTk;

    public LayuiRespone<Role> list(LayuiRequest<Role> request) {
        LayuiRespone<Role> respone = null;
        int page = request.getPage() > 0 ? request.getPage(): 1;
        int nums = request.getNums() > 0 ? request.getNums(): 10;
        Role role = request.getSearchParams();
        List<Role> roles = null;
        int count = 0;
        if(role != null){
            PageHelper.startPage(page,nums);
            roles = roleMapperTk.select(role);
        }else{
            PageHelper.startPage(page,nums);
            roles = roleMapperTk.selectAll();
        }
        count = roleMapperTk.selectCount(role);
        if(roles.size() > 0){
            respone = createLayuiResponse(200,"成功",count,roles);
        }else{
            respone = createLayuiResponse(0,"无数据",0,null);
        }
        return respone;
    }

    public boolean insertOrUpdate(int option, Role record) {
        return option == 1 ? insert(record) :update(record);
    }

    public boolean insert(Role record) {
        return roleMapperTk.insert(record) == 1;
    }

    public boolean update(Role record) {
        return roleMapperTk.updateByPrimaryKey(record) == 1;
    }

    public boolean del(Role record) {
        return roleMapperTk.delete(record) == 1;
    }
}
