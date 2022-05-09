package com.lpc.module1.service;

import cn.hutool.core.date.DateUtil;
import com.github.pagehelper.PageHelper;
import com.lpc.module1.mapper.tk.SysDictMapperTk;
import com.lpc.module1.model.SysDict;
import com.lpc.module1.model.SysMenu;
import com.lpc.module1.pojo.LayuiRequest;
import com.lpc.module1.pojo.LayuiRespone;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.lpc.module1.mapper.SysDictMapper;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @package:com.lpc.module1.service
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 */

@Service
@Transactional
@Log4j2
public class SysDictService{

    @Resource
    private SysDictMapper sysDictMapper;
    @Resource
    private SysDictMapperTk sysDictMapperTk;

    public LayuiRespone<SysDict> sysDict(LayuiRequest<SysDict> request) {
        LayuiRespone<SysDict> sysDictRespone = new LayuiRespone<>();
        int page = request.getPage() > 0 ? request.getPage() : 1;
        int nums = request.getNums() > 0 ? request.getNums() : 10;
        SysDict dict = request.getSearchParams();
        List<SysDict> dicts = null;
        int count = 0;
        if(dict != null){
            PageHelper.startPage(page,nums);
            dicts = sysDictMapper.selectUseLike(dict);
            count = sysDictMapper.selectCountUseLike(dict);
        }else{
            PageHelper.startPage(page,nums);
            dicts = sysDictMapperTk.selectAll();
            count = sysDictMapperTk.selectCount(null);
        }

        if(dicts.size() > 0){
            sysDictRespone.setCode(200);
            sysDictRespone.setData(dicts);
            sysDictRespone.setCount(count);
            sysDictRespone.setMessage("成功");
        }else{
            sysDictRespone.setCount(0);
            sysDictRespone.setData(null);
            sysDictRespone.setCode(400);
            sysDictRespone.setMessage("没有找到查询的数据");
        }
        return sysDictRespone;
    }

    public boolean insertOrUpdate(String option,SysDict sysDict){
        sysDict.setUpdateTime(DateUtil.date());
        if(option.equals("insert")){
            return insertDict(sysDict);
        }else if(option.equals("edit")){
            return updateDict(sysDict);
        }
        return false;
    }

    public boolean insertDict(SysDict record){
        return sysDictMapperTk.insert(record) == 1;
    }

    public boolean updateDict(SysDict record){
        return sysDictMapperTk.updateByPrimaryKey(record) == 1;
    }

    public boolean del(SysDict record){
        return sysDictMapperTk.delete(record) == 1;
    }
}
