package com.dcits;

import com.dcits.mapper.UserMapper;
import com.dcits.pojo.User;
import com.dcits.utils.FactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    private static Logger log = Logger.getLogger(App.class);

    private static SqlSession sqlSession;
    private static UserMapper userMapper;
    static {
        sqlSession = FactoryUtils.openSqlSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    public static void main( String[] args ) {

        //查
//        User user = userMapper.findUserById("001");
//        log.info(user);

        List<User> users = userMapper.findAll();
        for (User user: users) {
            log.info(user);
        }

        User user = new User();
        user.setUserId("003");
        user.setUserName("陈文斌");
        user.setUserAge("31");
        user.setAddress("hahaha");
//        user.setAddress("汇金中心6C");
//        userMapper.insertUser(user);

//        userMapper.deleteById("003");
//        userMapper.updateUser(user);


        sqlSession.commit();
        sqlSession.close();

    }

}
