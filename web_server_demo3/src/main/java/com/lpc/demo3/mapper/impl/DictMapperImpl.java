package com.lpc.demo3.mapper.impl;

import com.lpc.demo3.mapper.DictMapper;
import com.lpc.demo3.model.Dict;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
@Repository
public class DictMapperImpl extends MyMapperImpl<DictMapper> implements DictMapper {

    @Override
    public List<Dict> selectByTableNameAndColumnName(String tableName, String columnName) {
        return getMapper(DictMapper.class).selectByTableNameAndColumnName(tableName,columnName);
    }

}
