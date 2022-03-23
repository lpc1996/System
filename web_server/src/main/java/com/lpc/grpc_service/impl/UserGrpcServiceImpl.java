package com.lpc.grpc_service.impl;

import com.lpc.PublicGRPC;
import com.lpc.UserGRPC;
import com.lpc.UserServiceGrpc;
import com.lpc.grpc_service.UserGrpcService;
import com.lpc.mapper.impl.UserMapperImpl;
import com.lpc.model.User;
import com.lpc.util.GRPCUtil;
import com.lpc.util.ProtoBufUtils;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/10
 */
@Service
public class UserGrpcServiceImpl extends UserServiceGrpc.UserServiceImplBase implements UserGrpcService {

    private UserMapperImpl userMapper;

    public UserGrpcServiceImpl(UserMapperImpl userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void checkPass(UserGRPC.LoginMessage request,
                          StreamObserver<PublicGRPC.ResultBool> responseObserver) {
        try {
            boolean result = false;
            if(userMapper.ifNullByPrimaryKeyAndPass(request.getId(),
                            request.getPass()) == 1 ){
                result = true;
            }
            responseObserver.onNext(PublicGRPC.ResultBool.newBuilder()
                    .setResult(result).build());
        }catch (Exception e){
            e.printStackTrace();
            responseObserver.onError(GRPCUtil.wrapException(e));
        }
        responseObserver.onCompleted();

    }

    @Override
    public void getAllUsers(PublicGRPC.VoidMessage request, StreamObserver<UserGRPC.UserMessage> responseObserver) {
        try{
            List<User> users = userMapper.selectAll();
            for(User user:users){
                UserGRPC.UserMessage userMessage = ProtoBufUtils.userToUserMessage(user);
                responseObserver.onNext(userMessage);
            }
        }catch (Exception e){
            e.printStackTrace();
            responseObserver.onError(GRPCUtil.wrapException(e));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getUser(PublicGRPC.Id request, StreamObserver<UserGRPC.UserMessage> responseObserver) {

        try{
            UserGRPC.UserMessage userMessage = ProtoBufUtils.userToUserMessage(
                    userMapper.selectByPrimaryKey(request.getUserId()));

            responseObserver.onNext(userMessage);
        }catch (Exception e){
            e.printStackTrace();
            responseObserver.onError(GRPCUtil.wrapException(e));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void hasUser(PublicGRPC.Id request, StreamObserver<PublicGRPC.ResultBool> responseObserver) {
        try {
            boolean result = false;
            if(userMapper.ifNullByPrimaryKey(request.getUserId()) == 1){
                result = true;
            }
            responseObserver.onNext(PublicGRPC.ResultBool.newBuilder().setResult(result).build());
        } catch (Exception e) {
            e.printStackTrace();
            responseObserver.onError(GRPCUtil.wrapException(e));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void register(UserGRPC.UserWithPassMsg request, StreamObserver<PublicGRPC.ResultBool> responseObserver) {
        try{
            Object[] userAndPass = ProtoBufUtils.userWithPassMsgToUserAndPass(request);
            boolean result = userMapper.insert((User) userAndPass[0], (String) userAndPass[1]) == 1 ? true : false;

            responseObserver.onNext(PublicGRPC.ResultBool.newBuilder().setResult(
                    result
            ).build());
        }catch(Exception e){
            responseObserver.onError(GRPCUtil.wrapException(e));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void updatePass(UserGRPC.UpdatePassMessage request, StreamObserver<PublicGRPC.ResultBool> responseObserver) {
        try{
            boolean result = userMapper.updatePassByIdAndOldPass(request.getId(),request.getOldPass(),
                    request.getNewPass()) == 1 ? true : false;
            responseObserver.onNext(PublicGRPC.ResultBool.newBuilder().setResult(result).build());
        }catch (Exception e){
            responseObserver.onError(GRPCUtil.wrapException(e));
        }
        responseObserver.onCompleted();
    }
}
