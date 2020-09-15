package com.dcits;

import com.dcits.mapper.UserMapper;
import com.dcits.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        String resource = "mybatis-config.xml";

        try {

            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream(resource));

            SqlSession sqlSession = sqlSessionFactory.openSession();

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.findUserById("001");
            System.out.println(user);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
