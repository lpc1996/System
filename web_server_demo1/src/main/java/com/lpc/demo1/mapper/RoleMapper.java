package com.lpc.demo1.mapper;

import com.lpc.demo1.model.Role;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface RoleMapper extends Mapper<Role> {
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
    int insert(Role record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Role record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Role selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Role record);
}