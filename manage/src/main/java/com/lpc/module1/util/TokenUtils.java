package com.lpc.module1.util;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTPayload;
import cn.hutool.jwt.JWTUtil;
import lombok.Builder;

import java.util.HashMap;
import java.util.Map;

/**
 * @package:com.lpc.module1.util
 * @Author:旁观者
 * @Date:2022/5/4-19:11
 * @By:IntelliJ IDEA
 * @FileName:TokenUtils.java
 */
public class TokenUtils {

    public static final String tokenKey = "xx1602614lpc";

    /**
     * 生成token
     * @param userName
     * @param exp 过期时间，最低为15分钟
     * @return
     */
    public static String token (String userName, int exp){

        DateTime now = DateTime.now();
        exp = Math.max(exp, 15);
        DateTime endTime = now.offsetNew(DateField.MINUTE,exp);

        Map<String,Object> payload = new HashMap<String,Object>();
        //签发时间
        payload.put(JWTPayload.ISSUED_AT, now);
        //过期时间
        payload.put(JWTPayload.EXPIRES_AT, endTime);
        //生效时间
        payload.put(JWTPayload.NOT_BEFORE, now);
        //载荷
        payload.put(CommonParams.TOKEN_PAYLOAD_NAME,userName);

        String token = JWTUtil.createToken(payload,tokenKey.getBytes());
        return token;
    }

    public static String token(String userName){
        return TokenUtils.token(userName,30);
    }

    public static boolean verify(String token){
        /**
         * @desc   验证token，通过返回true
         * @params [token]需要校验的串
         **/
        JWT jwt = JWTUtil.parseToken(token);
        boolean verifyKey = jwt.setKey(tokenKey.getBytes()).verify();
        boolean verifyTime = jwt.validate(0);
        return verifyKey && verifyTime;
    }
    public static Object getParamsByToken(String token,String paramName){
        JWT jwt = JWTUtil.parseToken(token);
        Object param = jwt.getPayload(paramName);

        return param;
    }


    public static void main(String[] args) {
        String token = TokenUtils.token("07161075");
        System.out.println(token);
        System.out.println(TokenUtils.verify(token));
    }
}
