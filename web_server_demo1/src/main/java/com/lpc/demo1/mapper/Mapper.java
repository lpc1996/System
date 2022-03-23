package com.lpc.demo1.mapper;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public interface Mapper {
    <T> T getMapper();

    List selectByPage(Integer page, Integer pageSize);

    List findAll();
}
