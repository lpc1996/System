package com.lpc.module2.service;

import com.lpc.module2.model.Archive;
import com.lpc.module2.model.User;

import java.util.List;

public interface UserService extends Service {

    boolean login(String userName,String password);

    User getUser(String userName);

    Archive getArchive(String id);

    List<User> getAllUsers();

    List<User> getUsersByPage(Integer pageId,Integer size);

    boolean updatePass(String userName,String oldPass,String newPass);

    boolean regsiter(User user,String pass);

    boolean updateUserName(String userName,String id);

    boolean updateUser(User user);
}
