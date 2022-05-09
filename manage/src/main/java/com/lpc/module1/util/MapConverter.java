package com.lpc.module1.util;

import org.springframework.core.convert.converter.Converter;

import java.util.Map;

/**
 * @package:com.lpc.module1.util
 * @Author:旁观者
 * @Date:2022/5/6-14:41
 * @By:IntelliJ IDEA
 * @FileName:MapConverter.java
 */
public class MapConverter implements Converter<String, Map<String,String>> {
    /**
     * Convert the source object of type {@code S} to target type {@code T}.
     *
     * @param source the source object to convert, which must be an instance of {@code S} (never {@code null})
     * @return the converted object, which must be an instance of {@code T} (potentially {@code null})
     * @throws IllegalArgumentException if the source cannot be converted to the desired target type
     */
    @Override
    public Map<String, String> convert(String source) {
        StringBuilder stringBuilder = new StringBuilder(source);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
//        String subStr = stringBuilder
        return null;
    }

    /**
     * Construct a composed {@link Converter} that first applies this {@link Converter}
     * to its input, and then applies the {@code after} {@link Converter} to the
     * result.
     *
     * @param after the {@link Converter} to apply after this {@link Converter}
     *              is applied
     * @return a composed {@link Converter} that first applies this {@link Converter}
     * and then applies the {@code after} {@link Converter}
     * @since 5.3
     */
    @Override
    public <U> Converter<String, U> andThen(Converter<? super Map<String, String>, ? extends U> after) {
        return Converter.super.andThen(after);
    }
}
