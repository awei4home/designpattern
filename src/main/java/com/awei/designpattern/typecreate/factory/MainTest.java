package com.awei.designpattern.typecreate.factory;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("===========================工厂模式===========================");
        Vehicle vehicle = null;
        // 1 Bicycle, 2 Car
        vehicle = VehicleFactory.createVehicle(1);
        vehicle.countWheel();
        System.out.println("=============================================================");
        vehicle = VehicleFactory.createVehicle(2);
        vehicle.countWheel();
        System.out.println("===========================工厂模式===========================");
    }
}
