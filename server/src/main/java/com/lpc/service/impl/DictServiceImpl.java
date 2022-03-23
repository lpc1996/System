package com.lpc.service.impl;

import com.lpc.DictGrpc;
import com.lpc.DictServiceGrpc;
import com.lpc.PublicGRPC;
import com.lpc.mybatis.mapper.DictMapper;
import com.lpc.mybatis.mapper.impl.DictMapperImpl;
import com.lpc.service.DictService;
import com.lpc.util.ProtoBufUtils;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

/**
 * @author 濃霧-遠方
 * @date 2021/11/24
 */
@Service
public class DictServiceImpl extends DictServiceGrpc.DictServiceImplBase implements DictService {

    private DictMapperImpl dictMapper;

    public DictServiceImpl(DictMapperImpl dictMapper){
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
