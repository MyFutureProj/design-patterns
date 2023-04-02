package com.designpatterns.creational.prototypepattern;

/**
 * @author Ravi Panchal
 */
public class TwoWheeler extends Vehicle{

    private boolean isElectric;

    public TwoWheeler(String engine, String model, long price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    @Override
    protected TwoWheeler clone() throws CloneNotSupportedException {
        return (TwoWheeler)super.clone();
    }
}
