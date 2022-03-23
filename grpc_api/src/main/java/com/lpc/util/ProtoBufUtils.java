package com.lpc.util;

import com.google.protobuf.Timestamp;
import com.lpc.AuthorityGRPC;
import com.lpc.DictGrpc;
import com.lpc.UserGRPC;
import com.lpc.model.Dict;
import com.lpc.model.Menu;
import com.lpc.model.Role;
import com.lpc.model.User;
import java.util.Date;

/**
 * protoBufmessage和java bean相互转化
 * @author 濃霧-遠方
 * @date 2021/11/19
 */
public class ProtoBufUtils {


    public static UserGRPC.UserMessage userToUserMessage(User user){
        return UserGRPC.UserMessage.newBuilder()
                .setId(user.getId())
                .setStatus(user.getStatus())
                .setName(user.getName())
                .setCreateTime(Timestamp.newBuilder().setSeconds(user.getCreateTime().getTime()))
                .build();
    }

    public static UserGRPC.UserWithPassMsg userToUserWithPassMsg(User user,String pass){
        return UserGRPC.UserWithPassMsg.newBuilder()
                .setUser(userToUserMessage(user))
                .setPass(pass)
                .build();
    }

    public static User userMessageToUser(UserGRPC.UserMessage userMessage){
        User user = new User();
        user.setStatus(userMessage.getStatus());
        user.setName(userMessage.getName());
        user.setId(userMessage.getId());
        user.setCreateTime(new Date(userMessage.getCreateTime().getSeconds()));
        return user;
    }

    public static Object[] userWithPassMsgToUserAndPass(UserGRPC.UserWithPassMsg userWithPassMsg){
        User user = userMessageToUser(userWithPassMsg.getUser());
        String pass = userWithPassMsg.getPass();
        return new Object[]{user, pass};
    }

    public static DictGrpc.DictMessage dictToDictMessage(Dict dict){
        return DictGrpc.DictMessage.newBuilder()
                .setId(dict.getId())
                .setStatus(dict.getStatus())
                .setTableAndColumn(
                        DictGrpc.DictTableAndColumnMessage.newBuilder()
                                .setColumnName(dict.getColumnName())
                                .setTableName(dict.getTableName())
                                .build()
                )
                .setTypeCode(dict.getTypeCode())
                .setTypeName(dict.getTypeName())
                .setValueId(dict.getValueId())
                .setValueName(dict.getValueName())
                .setUpdateTime(Timestamp.newBuilder().setSeconds(
                        dict.getUpdateTime().getTime())
                        .build())
                .build();
    }

    public static Dict dictMessageToDict(DictGrpc.DictMessage dictMessage){
        Dict dict = new Dict();
        dict.setStatus((byte) dictMessage.getStatus());
        dict.setId(dictMessage.getId());
        dict.setTableName(dictMessage.getTableAndColumn().getTableName());
        dict.setColumnName(dictMessage.getTableAndColumn().getColumnName());
        dict.setTypeCode(dictMessage.getTypeCode());
        dict.setTypeName(dictMessage.getTypeName());
        dict.setValueId(dictMessage.getValueId());
        dict.setValueName(dictMessage.getValueName());
        dict.setUpdateTime(new Date(dictMessage.getUpdateTime().getSeconds()));
        return dict;
    }

    public static AuthorityGRPC.RoleMessage roleToRoleMessage(Role role){
        return AuthorityGRPC.RoleMessage.newBuilder()
                .setId(role.getId())
                .setName(role.getName())
                .setInfo(role.getInfo())
                .build();
    }

    public static Role roleMessageToRole(AuthorityGRPC.RoleMessage roleMessage){
        Role role = new Role();
        role.setId(roleMessage.getId());
        role.setName(roleMessage.getName());
        return role;
    }

    public static AuthorityGRPC.MenuMessage menuToMenuMessage(Menu menu){
        return AuthorityGRPC.MenuMessage.newBuilder()
                .setId(menu.getId())
                .setName(menu.getName())
                .setIconUrl(menu.getIconUrl())
                .setMenuCode(menu.getMenuCode())
                .setLevel(menu.getLevel())
                .setParent(menu.getParentId())
                .setUrl(menu.getUrl())
                .build();
    }

    public static Menu menuMessageToMenu(AuthorityGRPC.MenuMessage menuMessage){
        Menu menu = new Menu();
        menu.setId(menuMessage.getId());
        menu.setMenuCode(menuMessage.getMenuCode());
        menu.setLevel(menuMessage.getLevel());
        menu.setParentId(menuMessage.getParent());
        menu.setName(menuMessage.getName());
        menu.setUrl(menuMessage.getUrl());
        menu.setIconUrl(menuMessage.getIconUrl());
        return menu;
    }
}
