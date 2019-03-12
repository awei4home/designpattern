package com.awei.designpattern.typecreate.abstractfactory;

public class BicycleSpareTire implements SpareTire {
    @Override
    public void sayType() {
        System.out.println("i am Bicycle sparetire");
    }
}
