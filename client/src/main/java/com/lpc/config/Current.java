package com.lpc.config;

import com.lpc.model.User;

/**
 * @author 濃霧-遠方
 * @date 2021/11/16
 */
public interface Current {

    User getCurrentUser();
    void setCurrentUSer(User user);
}
