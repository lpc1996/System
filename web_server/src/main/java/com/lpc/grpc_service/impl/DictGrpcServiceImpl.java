package com.lpc.grpc_service.impl;

import com.lpc.DictGrpc;
import com.lpc.DictServiceGrpc;
import com.lpc.PublicGRPC;
import com.lpc.mapper.impl.DictMapperImpl;
import com.lpc.grpc_service.DictGrpcService;
import com.lpc.util.ProtoBufUtils;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

/**
 * @author 濃霧-遠方
 * @date 2021/11/24
 */
@Service
public class DictGrpcServiceImpl extends DictServiceGrpc.DictServiceImplBase implements DictGrpcService {

    private DictMapperImpl dictMapper;

    public DictGrpcServiceImpl(DictMapperImpl dictMapper){
        this.dictMapper = dictMapper;
    }

    @Override
    public void addDict(DictGrpc.DictMessage request, StreamObserver<PublicGRPC.ResultBool> responseObserver) {
        try {
            boolean result = dictMapper.insert(ProtoBufUtils.dictMessageToDict(request)) == 1;
            responseObserver.onNext(PublicGRPC.ResultBool.newBuilder().setResult(result).build());
        } catch (Exception e) {
            e.printStackTrace();
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getDict(PublicGRPC.Id request, StreamObserver<DictGrpc.DictMessage> responseObserver) {

    }

    @Override
    public void deleteDict(PublicGRPC.Id request, StreamObserver<PublicGRPC.ResultBool> responseObserver) {

    }

    @Override
    public void getDictsByTableAndColumn(DictGrpc.DictTableAndColumnMessage request, StreamObserver<DictGrpc.DictMessage> responseObserver) {

    }

    @Override
    public void updateDict(DictGrpc.DictMessage request, StreamObserver<PublicGRPC.ResultBool> responseObserver) {

    }

}
