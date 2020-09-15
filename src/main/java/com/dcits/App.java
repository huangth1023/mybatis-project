package com.dcits;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        String resource = "mybatis-config.xml";

//        try {
//
//            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(Resources.getResourceAsStream(resource));
//
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            User user = userMapper.findUserById("001");
//            System.out.println(user);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {

            ServerSocket serverSocket = new ServerSocket(2222);


            Socket socket = new Socket("localhost", 2222);
            InetAddress inetAddress = socket.getInetAddress();
            System.out.println(inetAddress.getHostName());
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getAddress());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
