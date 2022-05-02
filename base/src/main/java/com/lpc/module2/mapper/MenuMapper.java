package com.lpc.module2.mapper;

import com.lpc.module2.model.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface MenuMapper extends MyMapper {

    /**
     * 根据用户名userId获取该用户所拥有的的权限
     * @param userId 用户Id
     * @return 返回该用户所有权限的列表
     */
    List<Menu> selectByUserId(@Param("userId") String userId);


}