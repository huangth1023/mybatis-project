package com.dcits.designPattern.singleton;

/**
 * @Author: huangth tel:13246649002
 * Date: 2020/9/16 15:47
 * @Version:
 * @Description: 单例模式
 */
public class TestDemo02 {


    public static void main(String[] args) {

        //懒汉式


    }


}

//懒汉式
class Demo1 {

    private static Demo1 demo;

    //构造函数私有化
    private Demo1() {
    }

    public static Demo1 getInstance() {
        if (demo == null) {
            demo = new Demo1();
        }
        return demo;
    }

}

//饿汉式，线程安全
class Demo2 {

    private static Demo2 demo = new Demo2();

    //构造函数私有化
    private Demo2() {
    }

    public static Demo2 getInstance() {
        return demo;
    }

}

class Demo3 {

    //构造函数私有化
    private Demo3() {
    }

    public static Demo3 getInstance() {
        return demo3Holder.demo;
    }

    private static class demo3Holder {
        private static Demo3 demo = new Demo3();
    }

}
