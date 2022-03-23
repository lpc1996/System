package com.lpc.service;

import com.lpc.model.Archive;
import com.lpc.model.User;

import java.util.List;

public interface UserService {

    boolean login(String userName,String password);

    User getUser(String userName);

    Archive getArchive(String id);

    List<User> getAllUsers();

    boolean updatePass(String userName,String oldPass,String newPass);

    boolean regsiter(User user,String pass);

    boolean updateUserName(String userName,String id);

    boolean updateUser(User user);
}
