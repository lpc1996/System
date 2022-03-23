package com.lpc.client;

import com.lpc.model.Menu;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/12/30
 */
public interface AuthorityClient extends Client{

    List<Menu> getMenuByUser(String userId);
}
