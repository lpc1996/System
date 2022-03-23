package com.lpc.demo3.mapper;

import java.util.List;
import com.lpc.demo3.model.RoleUser;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface RoleUserMapper {
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

    int selectCount();

    List<RoleUser> selectAll();


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