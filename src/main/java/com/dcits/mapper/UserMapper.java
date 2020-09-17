package com.dcits.mapper;

import com.dcits.pojo.User;

import java.util.List;

/**
 * @author huangth tel:13246649002
 * @date 2020/9/15 22:47
 * @projectName mybatis-project
 * @desc
 */
public interface UserMapper {

    User findUserById(String id);

    List<User> findAll();

    void deleteById(String id);

    void updateUser(User user);

    void insertUser(User user);

}
