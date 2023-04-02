package com.designpatterns.structural.adaptor;

/**
 * @author Ravi Panchal
 */
public class NexonEV implements EV{
    @Override
    public void electricMotor() {
        System.out.println("Motor: Permanent Magnet Synchronous Motor");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage: 350km/charge");
    }

    @Override
    public void speed() {
        System.out.println("speed: 140km/hr");
    }

    @Override
    public void electricity() {
        System.out.println("Battery: Lithium-ion battery pack");
    }
}
