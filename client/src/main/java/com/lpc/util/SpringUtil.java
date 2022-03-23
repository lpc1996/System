package com.lpc.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 濃霧-遠方
 * @date 2021/11/11
 */
public class SpringUtil {
    private static ApplicationContext context;

    static{
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public static ApplicationContext getApplicationContext(){
        return context;
    }

    public static Object getBean(String beanId){
        return getBean(beanId);
    }

    public static Object getBean(String beanId,Object ...param){
        return context.getBean(beanId,param);
    }

    public static <T> T getBean(Class<T> requiredType, Object... args){
        return context.getBean(requiredType,args);
    }

    public static <T> T getBean(Class<T> requiredType){
        return getBean(requiredType);
    }

    public static <T> T getBean(String name, Class<T> requiredType){
        return context.getBean(name,requiredType);
    }
}
