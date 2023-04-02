package com.designpatterns.creational.prototypepattern;

/**
 * @author Ravi Panchal
 */
public abstract class Vehicle implements Cloneable{

    private String engine;
    private String model;
    private long price;

    public Vehicle(String engine, String model, long price) {
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    @Override
    protected Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle)super.clone();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
