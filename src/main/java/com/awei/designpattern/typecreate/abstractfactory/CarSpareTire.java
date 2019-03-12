package com.awei.designpattern.typecreate.abstractfactory;

public class CarSpareTire implements SpareTire {
    @Override
    public void sayType() {
        System.out.println("i am car sparetire");
    }
}
