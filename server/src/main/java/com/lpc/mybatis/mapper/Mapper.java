package com.lpc.mybatis.mapper;

import com.lpc.mybatis.mapper.DictMapper;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public interface Mapper {
    <T> T getMapper();
}
