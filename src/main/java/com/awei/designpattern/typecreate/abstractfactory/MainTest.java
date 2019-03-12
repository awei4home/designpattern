package com.awei.designpattern.typecreate.abstractfactory;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("===========================抽象工厂模式===========================");
        Sell sell = new Sell();
        // 卖自行车
        AbstractFactory sellBicycleFactory = new SellBicycleFactory();
        sell.sell(sellBicycleFactory);
        System.out.println("================================================================");

        // 卖汽车
        AbstractFactory sellCarFactory = new SellCarFactory();
        sell.sell(sellCarFactory);
        System.out.println("===========================抽象工厂模式===========================");
    }
}
