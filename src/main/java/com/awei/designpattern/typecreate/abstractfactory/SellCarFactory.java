package com.awei.designpattern.typecreate.abstractfactory;

public class SellCarFactory implements AbstractFactory {
    @Override
    public SpareTire createSpareTire() {
        return new CarSpareTire();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car(4);
    }
}
