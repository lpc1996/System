package com.lpc.util;

import com.google.gson.Gson;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.JsonFormat;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 濃霧-遠方
 * @date 2021/11/8
 */
public class GRPCUtil {

    private static final Metadata.Key<byte[]> EXCEPTIME_KEY = Metadata.Key.of("exception-bin",Metadata.BINARY_BYTE_MARSHALLER);

    /**
     * 服务端向客户端发送错误信息
     * 服务端不直接onErrot()，而使用下面的代码向客户端发送错误信息
     * <p>responseObserver.onError(GrpcExceptionUtil.wrapException(e));</p>
     *
     * @param e
     * @return
     */
    public static StatusRuntimeException wrapException(Exception e){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try(ObjectOutputStream oos = new ObjectOutputStream(byteArrayOutputStream)){
            oos.writeObject(e);
            Metadata metadata = new Metadata();
            metadata.put(EXCEPTIME_KEY,Arrays.copyOfRange(byteArrayOutputStream.toByteArray(),0,byteArrayOutputStream.size()));
            return Status.INTERNAL.asRuntimeException(metadata);
        }catch(IOException exception){
            System.out.println("Throw Exception to client failed.");
            return Status.INTERNAL.withCause(exception).asRuntimeException();
        }
    }

    /**
     * 客户端解析服务端发来的错误信息
     * 客户端使用下面的代码解析服务端发来的错误信息
     * <p>
     *     try{
     *
     *     }catch(StatusRuntimeException e){
     *         Exception exception = GRPCUtil.unwrapStatusRuntimeException(e);
     *         exception.printStackTrace();
     *     }
     * </p>
     * @param e
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static Exception unwrapStatusRunTimeException(StatusRuntimeException e) throws IOException,ClassNotFoundException{
        Metadata trailers = e.getTrailers();
        if(trailers == null || !trailers.containsKey(EXCEPTIME_KEY) || trailers.get(EXCEPTIME_KEY) == null){
            return e;
        }
        byte[] bytes = trailers.get(EXCEPTIME_KEY);
        try(ObjectInputStream oin = new ObjectInputStream(new ByteArrayInputStream(bytes,0,bytes.length))){
            Object exception = oin.readObject();
            return (Exception) exception;
        }
    }

    /**
     * 将ProtoBean对象转化为POJO对象
     *
     * @param destPojoClass 目标POJO对象的类类型
     * @param sourceMessage 含有数据的ProtoBean对象实例
     * @param <PojoType> 目标POJO对象的类类型范型
     * @return
     * @throws IOException
     */
    public static <PojoType> PojoType toPojoBean( Class<PojoType> destPojoClass,  Message sourceMessage)
            throws IOException {
        String json = JsonFormat.printer().print(sourceMessage);
        System.out.println(json);
        return new Gson().fromJson(json, destPojoClass);
    }

    /**
     * ProtoBuffer object to POJO
     */
    public static <T> T fromProtoBuffer(GeneratedMessageV3 pbObject, Class<T> modelClass) {
        T model = null;

        try {
            model = modelClass.getDeclaredConstructor().newInstance();
            Field[] modelFields = modelClass.getDeclaredFields();
            if (modelFields != null && modelFields.length > 0) {
                for (Field modelField : modelFields) {
                    String fieldName = modelField.getName();
                    String name = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

                    Class<?> fieldType = modelField.getType();
                    try {
                        Method pbGetMethod = pbObject.getClass().getMethod("get" + name);
                        Object value = pbGetMethod.invoke(pbObject);
                        Method modelSetMethod = modelClass.getMethod("set" + name, fieldType);
                        if (value.getClass().getTypeName() == "google.protobuf.Timestamp"){
//                            Timestamp timestamp = (Timestamp) value;
                            modelSetMethod.invoke(model,timestampToDate((Timestamp) value));
                        }

                        modelSetMethod.invoke(model, value);
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;
    }

    /**
     * 将POJO对象转化为ProtoBean对象
     *
     * @param destBuilder 目标Message对象的Builder类
     * @param sourcePojoBean 含有数据的POJO对象
     * @return
     * @throws IOException
     */
    public static void toProtoBean(Message.Builder destBuilder, Object sourcePojoBean) throws IOException {
        String json = new Gson().toJson(sourcePojoBean);
        System.out.println(json);
        JsonFormat.parser().merge(json, destBuilder);
    }

    /**
     * POJO -> ProtoBuffer object
     */
    public static <T> T toProtoBuffer(Object model, Class<T> pbClass) {
        if (!GeneratedMessageV3.class.isAssignableFrom(pbClass)) {
            throw new RuntimeException("Not ProtoBuffer message type");
        }

        T pbObject = null;

        try {
            Object pbBuilder = pbClass.getDeclaredMethod("newBuilder").invoke(null);
            Field[] pbFields = pbClass.getDeclaredFields();
            if (pbFields != null && pbFields.length > 0) {
                for (Field pbField : pbFields) {
                    System.out.println(pbField.getName());
                    String fieldName = pbField.getName().substring(0, pbField.getName().length() - 1);
                    String name = fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
                    Class<?> fieldType = pbField.getType();
                    if (pbField.getType() == Object.class) {
                        fieldType = String.class;
                    }

                    try {
                        Method modelGetMethod = model.getClass().getMethod("get" + name);
                        Object value = modelGetMethod.invoke(model);
                        if (value != null) {
                            Method pbBuilderSetMethod = pbBuilder.getClass().getMethod("set" + name, fieldType);
                            pbBuilderSetMethod.invoke(pbBuilder, value);
                        }
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    }
                }
            }
            pbObject = (T) pbBuilder.getClass().getDeclaredMethod("build").invoke(pbBuilder);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pbObject;
    }

    static final long MILLIS_PER_SECOND = 1000;

    /**
     * google.proto.timestamp -> java.util.Date
     */
    public static Date timestampToDate(Timestamp timestamp) {
        return new Date(timestamp.getSeconds() * MILLIS_PER_SECOND);
    }

    /**
     * java.util.Date -> google.proto.timestamp
     */
    public static Timestamp dateToTimestamp(Date date) {
//        return Timestamps.fromMillis(date.getTime());
        return null;
    }

//    public static <T> T getBlockStub(){
//
//    }
}
