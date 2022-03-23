package com.lpc.client.impl;

import com.lpc.PublicGRPC;
import com.lpc.UserGRPC;
import com.lpc.UserServiceGrpc;
import com.lpc.client.UserClient;
import com.lpc.model.User;
import com.lpc.util.GRPCUtil;
import com.lpc.util.ProtoBufUtils;
import com.lpc.util.SpringUtil;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.io.IOException;

/**
 * @author 濃霧-遠方
 * @date 2021/11/10
 */
public class UserClientImpl implements UserClient{

    private ManagedChannel channel;
    private UserServiceGrpc.UserServiceBlockingStub stub;
    private UserServiceGrpc.UserServiceStub asyncStub;

    private UserClientImpl(String host, int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
        .usePlaintext()
        .build();
        //创建存根
        stub = UserServiceGrpc.newBlockingStub(channel);
        asyncStub = UserServiceGrpc.newStub(channel);
    }

    @Override
    public boolean hasUser(String id) throws IOException, ClassNotFoundException {
        boolean result = false;
        try {
            result = stub.hasUser(PublicGRPC.Id.newBuilder().setUserId(id).build()).getResult();
        } catch (StatusRuntimeException e) {
            Exception exception = GRPCUtil.unwrapStatusRunTimeException(e);
            exception.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean checkPass(String id, String pass) throws IOException, ClassNotFoundException{
        boolean result = false;
        try{
            result = stub.checkPass(UserGRPC.LoginMessage.newBuilder().setId(id).setPass(pass).build()).getResult();
        }catch (StatusRuntimeException e) {
            Exception exception = GRPCUtil.unwrapStatusRunTimeException(e);
            exception.printStackTrace();
        }
        return result;
    }

    @Override
    public User getUser(String id) throws ClassNotFoundException, IOException {
        try {
            return ProtoBufUtils.userMessageToUser(
                    stub.getUser(
                            PublicGRPC.Id.newBuilder().setUserId(id).build()));
        } catch (StatusRuntimeException e) {
            Exception exception = GRPCUtil.unwrapStatusRunTimeException(e);
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean updatePass(String id, String oldPass, String newPass) throws ClassNotFoundException, IOException {
        try{
             return stub.updatePass(UserGRPC.UpdatePassMessage.newBuilder()
                     .setId(id).setNewPass(newPass).setOldPass(oldPass).build()).getResult();
        }catch (StatusRuntimeException e) {
            Exception exception = GRPCUtil.unwrapStatusRunTimeException(e);
            exception.printStackTrace();
        }
        return false;
    }


    public static void main(String[] args) {
        UserClientImpl userClientImpl = (UserClientImpl) SpringUtil.getApplicationContext().getBean("userClientImpl");
        try {
            System.out.println("服务端返回："+ userClientImpl.getUser("07161075"));
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
