package com.lpc.module1.mapper;

import com.lpc.module1.model.SysDict;
import com.lpc.module1.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 *
 @package:com.lpc.module1.mapper
 @Author:旁观者
 @Date:2022/5/4-14:42
 @By:IntelliJ IDEA
 */

public interface SysDictMapper extends MyMapper {

    /**
     * 使用like的模糊查询
     * @param record
     * @return
     */
    List<SysDict> selectUseLike(@Param("record") SysDict record);

    /**
     * 获取符合like条件的结果总数，不经过分页
     * @param record
     * @return
     */
    Integer selectCountUseLike(@Param("record") SysDict record);
}