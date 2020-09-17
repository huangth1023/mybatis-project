package com.dcits.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @Author: huangth tel:13246649002
 * Date: 2020/9/17 17:38
 * @Version:
 * @Description:
 */
public class FactoryUtils {

    public static SqlSessionFactory sqlSessionFactory;

    private FactoryUtils() {}

    public static SqlSessionFactory getSqlSessionFactory() {

        synchronized (FactoryUtils.class) {

            if (sqlSessionFactory != null) {
                return sqlSessionFactory;
            }

            String resource = "mybatis-config.xml";

            try {

                sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));

            } catch (IOException e) {
                e.printStackTrace();
            }

            return sqlSessionFactory;
        }
    }

    public static SqlSession openSqlSession() {

        if (sqlSessionFactory == null) {
            getSqlSessionFactory();
        }

        return sqlSessionFactory.openSession();
    }

}
