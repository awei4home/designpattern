package com.awei.designpattern.typecreate.abstractfactory;

public interface AbstractFactory {

    public SpareTire createSpareTire();

    public Vehicle createVehicle();
}
