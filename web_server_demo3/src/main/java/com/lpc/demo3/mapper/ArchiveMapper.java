package com.lpc.demo3.mapper;

import java.util.List;

import com.lpc.demo3.model.Archive;

/**
  @package:com.lpc.mapper
  @Author:旁观者
  @Date:2022/2/13-16:52
  @FileName:ArchiveMapper.java
*/
public interface ArchiveMapper{
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(Archive record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(Archive record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    Archive selectByPrimaryKey(String id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Archive record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Archive record);

    List<Archive> selectAll();

	int selectCount();
}