package com.dcits.pojo;

import java.io.Serializable;

/**
 * @author huangth tel:13246649002
 * @date 2020/9/15 22:47
 * @projectName mybatis-project
 * @desc
 */
public class User implements Serializable {

    private String userId;
    private String userName;
    private String userAge;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userAge='" + userAge + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
