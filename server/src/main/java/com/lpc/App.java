package com.lpc;

import com.lpc.mybatis.mapper.impl.UserMapperImpl;
import com.lpc.model.User;
import com.lpc.util.SpringUtil;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = SpringUtil.getApplicationContext();
        UserMapperImpl userMapper = (UserMapperImpl) context.getBean("userMapper");
        for (User user : userMapper.selectAll()) {
            System.out.println(user);
        }
        System.out.println( "Hello World!" );
    }
}
