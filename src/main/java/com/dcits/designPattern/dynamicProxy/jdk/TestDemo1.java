package com.dcits.designPattern.dynamicProxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @Author: huangth tel:13246649002
 * Date: 2020/9/16 14:53
 * @Version:
 * @Description:
 */
public class TestDemo1 {

    public static void main(String[] args) {

        //1.获得真实类
        Singer singer = new Singer();

        //2.根据真实类创建代理类
        Person proxyInstance = (Person) Proxy.newProxyInstance(
                singer.getClass().getClassLoader(),
                singer.getClass().getInterfaces(),
                (proxy, method, args1) -> {

                    if (proxy == null) {
                        
                    }

                    return method.invoke(singer, args1);
                });

        proxyInstance.sing("mojito");

    }

    public static String concat(String a, String b) {
        return a + b;
    }

}

interface Person {

    void sing(String str);

}

class Singer implements Person {

    @Override
    public void sing(String str) {

    }
}
