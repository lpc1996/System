package com.lpc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 濃霧-遠方
 * @date 2021/11/4
 */
public class MyBatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static{
        try {
            InputStream inputStream = Resources.getResourceAsStream(Config.myBatisConfig);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
