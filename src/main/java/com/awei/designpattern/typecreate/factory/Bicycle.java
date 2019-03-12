package com.awei.designpattern.typecreate.factory;

public class Bicycle implements Vehicle {

    private int wheels = 0;
    public  Bicycle(int wheels){
        this.wheels = wheels;
    }

    @Override
    public void countWheel() {
        System.out.println("Bicycle ===> the count wheel：" + wheels);
    }
}
