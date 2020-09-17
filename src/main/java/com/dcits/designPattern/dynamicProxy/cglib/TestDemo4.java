package com.dcits.designPattern.dynamicProxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;

/**
 * @Author: huangth tel:13246649002
 * Date: 2020/9/16 16:44
 * @Version:
 * @Description:
 */
public class TestDemo4 {

    public static void main(String[] args) {


        RealClass realClass = new RealClass();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealClass.class);
        enhancer.setCallback((InvocationHandler) (o, method, objects) -> {

            System.out.println("hello");
            return method.invoke(realClass,objects);
        });

        RealClass proxy = (RealClass) enhancer.create();
        proxy.print();


    }


}

class RealClass {

    public void print() {
        System.out.println("RealClass===print");

    }

}



