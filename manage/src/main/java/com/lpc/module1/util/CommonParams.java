package com.lpc.module1.util;

/**
 * @package:com.lpc.module1.util
 * @Author:旁观者
 * @Date:2022/5/5-15:33
 * @By:IntelliJ IDEA
 * @FileName:CommonParams.java
 */
public class CommonParams {

    //服务根目录
    public static final String ROOT_URL = "/school_manage";
    //token串名称
    public static final String TOKEN = "token";
    //token过期时间
    public static final int TOKEN_END = 30;
    //refresh_token串名称
    public static final String REFRESH_TOKEN = "refresh_token";
    //refresh_token过期时间
    public static final int REFRESH_TOKEN_END = 24*60;
    //token载荷名称
    public static final String TOKEN_PAYLOAD_NAME = "userName";

}
