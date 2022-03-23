package com.lpc.client.impl;

import com.lpc.AuthorityGRPC;
import com.lpc.AuthorityServiceGrpc;
import com.lpc.PublicGRPC;
import com.lpc.client.AuthorityClient;
import com.lpc.model.Menu;
import com.lpc.util.ProtoBufUtils;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 濃霧-遠方
 * @date 2021/12/30
 */
public class AuthorityClientImpl implements AuthorityClient {

    private ManagedChannel channel;
    private AuthorityServiceGrpc.AuthorityServiceBlockingStub stub;
    private AuthorityServiceGrpc.AuthorityServiceStub asyncStub;

    public AuthorityClientImpl(String host, int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext()
                .build();
        stub = AuthorityServiceGrpc.newBlockingStub(channel);
        asyncStub = AuthorityServiceGrpc.newStub(channel);
    }

    @Override
    public List<Menu> getMenuByUser(String userId) {
        Iterator<AuthorityGRPC.MenuMessage> menuMessageIterator = stub.getUserMenu(PublicGRPC.Id.newBuilder().setUserId(userId).build());
        List<Menu> menuList = new ArrayList<>();
        for (;menuMessageIterator.hasNext() ;  ) {
            menuList.add(ProtoBufUtils.menuMessageToMenu(menuMessageIterator.next()));
        }
        return menuList;
    }
}
