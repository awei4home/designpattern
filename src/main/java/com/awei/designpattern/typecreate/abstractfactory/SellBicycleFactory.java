package com.awei.designpattern.typecreate.abstractfactory;

public class SellBicycleFactory implements AbstractFactory {
    @Override
    public SpareTire createSpareTire() {
        return new BicycleSpareTire();
    }

    @Override
    public Vehicle createVehicle() {
        return new Bicycle(2);
    }
}
