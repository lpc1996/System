package com.lpc.module1.mapper.impl;

import com.lpc.module1.mapper.SysDictMapper;
import com.lpc.module1.model.SysDict;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @package:com.lpc.module1.mapper.impl
 * @Author:旁观者
 * @Date:2022/5/7-10:53
 * @By:IntelliJ IDEA
 * @FileName:SysDictMapperImpl.java
 */
@Repository
public class SysDictMapperImpl extends MyMapperImpl<SysDictMapper> implements SysDictMapper {

    /**
     * 使用like的模糊查询
     *
     * @param record
     * @return
     */
    @Override
    public List<SysDict> selectUseLike(SysDict record) {

        return getMapper(SysDictMapper.class).selectUseLike(record);
    }

    /**
     * 获取符合like条件的结果总数，不经过分页
     *
     * @param record
     * @return
     */
    @Override
    public Integer selectCountUseLike(SysDict record) {
        return getMapper(SysDictMapper.class).selectCountUseLike(record);
    }
}
