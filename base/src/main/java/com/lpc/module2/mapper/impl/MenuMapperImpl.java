package com.lpc.module2.mapper.impl;

import com.lpc.module2.mapper.MenuMapper;
import com.lpc.module2.model.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
@Repository
public class MenuMapperImpl extends MyMapperImpl<MenuMapper> implements MenuMapper {

    /**
     * @param userId
     * @return
     */
    @Override
    public List<Menu> selectByUserId(String userId) {
        return getMapper(MenuMapper.class).selectByUserId(userId);
    }

}
