package com.dcits.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author huangth tel:13246649002
 * @date 2020/9/15 22:47
 * @projectName mybatis-project
 * @desc
 */
public class User implements Serializable {

    private String id;
    private String name;
    private String age;
    private String address;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    
}
