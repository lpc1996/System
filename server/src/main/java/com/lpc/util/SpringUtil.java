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
}
