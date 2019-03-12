package com.awei.designpattern.typecreate.abstractfactory;

public class Sell {
    private SpareTire spareTire = null;
    private Vehicle vehicle = null;

    public void sell(AbstractFactory af) {
        this.spareTire = af.createSpareTire();
        this.vehicle = af.createVehicle();

        // 测试
        this.spareTire.sayType();
        this.vehicle.countWheel();
    }
}
