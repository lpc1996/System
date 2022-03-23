package com.lpc.demo1.mapper;

import com.lpc.demo1.model.RoleUser;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface RoleUserMapper extends Mapper<RoleUser> {
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
    int insert(RoleUser record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(RoleUser record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    RoleUser selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(RoleUser record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(RoleUser record);
}