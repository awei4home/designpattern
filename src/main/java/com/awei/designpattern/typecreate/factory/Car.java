package com.awei.designpattern.typecreate.factory;

public class Car implements Vehicle {
    private int wheels = 0;
    public  Car(int wheels){
        this.wheels = wheels;
    }

    @Override
    public void countWheel() {
        System.out.println("Car ===> the count wheel：" + wheels);
    }
}
