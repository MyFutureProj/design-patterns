package com.designpatterns.creational.prototypepattern;

/**
 * @author Ravi Panchal
 */
public class DemoPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        VehicleRegistry vehicleRegistry = new VehicleRegistry();
        Vehicle vehicle = vehicleRegistry.getVehicle("TWO_WHEEL");
        System.out.println("Vehicle Details:" +vehicle.toString());

        VehicleRegistry vehicleRegistry1 = new VehicleRegistry();
        Vehicle vehicle1 = vehicleRegistry.getVehicle("FOUR_WHEEL");
        System.out.println("Vehicle Details:" +vehicle1.toString());
    }
}
