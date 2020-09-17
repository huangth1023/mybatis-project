package com.dcits.designPattern.builder;

/**
 * @Author: huangth tel:13246649002
 * Date: 2020/9/17 16:01
 * @Version:
 * @Description:
 */
public class TestDemo5 {

    public static void main(String[] args) {

        TicketHelper ticketHelper = new TicketHelper();
        ticketHelper.buildAdult("成人");
        ticketHelper.buildChildren("儿童");
        ticketHelper.buildSoldier("军人");

        TicketBuilder.builder(ticketHelper);

    }


}

class TicketHelper {

    public void buildAdult(String info) {
        System.out.println("构建成人票：" + info);
    }

    public void buildChildren(String info) {
        System.out.println("构建儿童票：" + info);
    }

    public void buildSoldier(String info) {
        System.out.println("构建军人票：" + info);
    }

}

class TicketBuilder {

    public static Object builder(TicketHelper helper) {
        System.out.println("开始构建套票信息");
        return null;
    }

}