package com.lpc.module1.util;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @package:com.lpc.demo3.util
 * @Author:旁观者
 * @Date:2022/4/15-15:24
 * @By:IntelliJ IDEA
 * @FileName:DateConverter.java
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        // 其中s是输入的原数据类型
        //将日期字符串转换成日期对象 返回
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try {
            date = format.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public <U> Converter<String, U> andThen(Converter<? super Date, ? extends U> after) {
        return Converter.super.andThen(after);
    }
}
