package com.lpc.config.impl;

import com.lpc.config.Current;
import com.lpc.model.User;
import lombok.Data;

/**
 * @author 濃霧-遠方
 * @date 2021/11/16
 */
@Data
public class CurrentImpl implements Current {

    private User user;

    @Override
    public User getCurrentUser() {
        return user;
    }

    @Override
    public void setCurrentUSer(User user) {
        this.user = user;
    }


}
