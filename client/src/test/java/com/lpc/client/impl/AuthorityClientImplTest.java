package com.lpc.client.impl;

import com.lpc.client.AuthorityClient;
import com.lpc.util.ProtoBufUtils;
import com.lpc.util.SpringUtil;
import org.junit.Test;

/**
 * @author 濃霧-遠方
 * @date 2021/12/30
 */
public class AuthorityClientImplTest {

    @Test
    public void getMenuByUser() {
        AuthorityClient authorityClient = (AuthorityClient) SpringUtil.getApplicationContext().getBean("authorityClient");
        System.out.println(authorityClient.getMenuByUser("07161075"));
    }
}