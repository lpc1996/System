package com.lpc.demo3.mapper;

import com.lpc.demo3.model.Dict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public interface DictMapper extends MyMapper{


    /**
     *
     * @param tableName
     * @param columnName
     * @return
     */
    List<Dict> selectByTableNameAndColumnName(@Param("tableName")String tableName,@Param("columnName")String columnName);


}