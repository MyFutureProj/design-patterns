package com.designpatterns.structural.adaptor;

/**
 * @author Ravi Panchal
 */
public class Amaze implements Engine{
    @Override
    public void engine() {
        System.out.println("Amaze: 1.2L engine");
    }

    @Override
    public void fuel() {
        System.out.println("Amaze: Non turbo petrol");
    }

    @Override
    public void mileage() {
        System.out.println("Amaze mileage: 18km/l");
    }

    @Override
    public void speed() {
        System.out.println("Amaze mileage: 140km/hr");
    }
}
