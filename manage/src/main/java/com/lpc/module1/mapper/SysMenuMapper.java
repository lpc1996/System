package com.lpc.module1.mapper;

import com.lpc.module1.model.SysMenu;
import com.lpc.module1.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @package:com.lpc.module1.mapper
 * @Author:旁观者
 * @Date:2022/5/4-14:42
 * @By:IntelliJ IDEA
 */

public interface SysMenuMapper extends MyMapper {

    List<SysMenu> selectByUserId(@Param("userId") String userId);
}