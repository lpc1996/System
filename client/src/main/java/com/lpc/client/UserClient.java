package com.lpc.client;

import com.lpc.model.User;

import java.io.IOException;

/**
 * @author 濃霧-遠方
 * @date 2021/11/12
 */
public interface UserClient extends Client{
    boolean hasUser(String id) throws IOException, ClassNotFoundException;
    boolean checkPass(String id,String pass) throws IOException, ClassNotFoundException;
    User getUser(String id) throws IOException, ClassNotFoundException;
    boolean updatePass(String id,String oldPass,String newPass) throws ClassNotFoundException, IOException;
}
