package com.lpc.demo3.mapper;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public interface Mapper {
    <T> T getMapper();

    List selectAll();

    int selectCount();
}
