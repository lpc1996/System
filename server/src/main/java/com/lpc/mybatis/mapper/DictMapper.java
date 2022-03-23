package com.lpc.mybatis.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.lpc.model.Dict;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface DictMapper {
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
    int insert(Dict record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Dict record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Dict selectByPrimaryKey(Long id);

    /**
     *
     * @param tableName
     * @param columnName
     * @return
     */
    List<Dict> selectByTableNameAndColumnName(@Param("tableName")String tableName,@Param("columnName")String columnName);



    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Dict record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Dict record);
}