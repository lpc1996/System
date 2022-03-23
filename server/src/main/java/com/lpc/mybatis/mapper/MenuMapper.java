package com.lpc.mybatis.mapper;

import com.lpc.model.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface MenuMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Menu record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Menu record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Menu selectByPrimaryKey(Long id);

    /**
     * 根据用户名userId获取该用户所拥有的的权限
     * @param userId 用户Id
     * @return 返回该用户所有权限的列表
     */
    List<Menu> selectByUserId(@Param("userId") String userId);

    /**
     * 获取所有菜单
     * @return 返回所有菜单的列表
     */
    List<Menu> selectAll();

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Menu record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Menu record);
}