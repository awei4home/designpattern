package com.awei.designpattern.typecreate.factory;

public class VehicleFactory {

    public static Vehicle createVehicle(int type){
        Vehicle vehicle = null;
        if(type == 1){
            vehicle = new Bicycle(2);
        }else if(type == 2){
            vehicle = new Car(4);
        }
        return vehicle;
    }
}
