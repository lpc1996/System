package com.lpc.service.impl;

import com.lpc.AuthorityGRPC;
import com.lpc.AuthorityServiceGrpc;
import com.lpc.PublicGRPC;
import com.lpc.mapper.impl.*;
import com.lpc.mapper.MenuMapper;
import com.lpc.model.Menu;
import com.lpc.service.AuthorityService;
import com.lpc.util.GRPCUtil;
import com.lpc.util.ProtoBufUtils;
import com.lpc.util.SpringUtil;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/11/10
 */
@Service
@AllArgsConstructor
public class AuthorityServiceImpl extends AuthorityServiceGrpc.AuthorityServiceImplBase implements  AuthorityService {

    private UserMapperImpl userMapper;
    private RoleMapperImpl roleMapper;
    private MenuMapperImpl menuMapper;
    private RoleUserMapperImpl roleUserMapper;
    private RoleMenuMapperImpl roleMenuMapper;

    @Override
    public void getRole(PublicGRPC.Id request, StreamObserver<AuthorityGRPC.RoleMessage> responseObserver) {
        try{
            responseObserver.onNext(
                    GRPCUtil.toProtoBuffer(roleMapper.selectByPrimaryKey(request.getCommonId()), AuthorityGRPC.RoleMessage.class));
        }catch (Exception e){
            e.printStackTrace();
            responseObserver.onError(GRPCUtil.wrapException(e));
        }
    }

    @Override
    public StreamObserver<PublicGRPC.Id> getMenu(StreamObserver<AuthorityGRPC.MenuMessage> responseObserver) {
        return new StreamObserver<PublicGRPC.Id>() {
            @Override
            public void onNext(PublicGRPC.Id id) {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }

    @Override
    public void getRoleMenu(PublicGRPC.Id request, StreamObserver<AuthorityGRPC.RoleMenuMessage> responseObserver) {

    }

    @Override
    public void getRoleUser(PublicGRPC.Id request, StreamObserver<AuthorityGRPC.RoleUserMessage> responseObserver) {

    }

    @Override
    public void getUserMenu(PublicGRPC.Id request, StreamObserver<AuthorityGRPC.MenuMessage> responseObserver) {
        List<Menu> menuList = menuMapper.selectByUserId(request.getUserId());
        for (Menu menu:menuList){
            responseObserver.onNext(ProtoBufUtils.menuToMenuMessage(menu));
        }
        responseObserver.onCompleted();
    }

}
