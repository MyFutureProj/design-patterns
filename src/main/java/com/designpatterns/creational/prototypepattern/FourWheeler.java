package com.designpatterns.creational.prototypepattern;

/**
 * @author Ravi Panchal
 */
public class FourWheeler extends Vehicle{

    private boolean isAutomatic;
    private boolean isDiesel;

    public FourWheeler(String engine, String model, long price, boolean isAutomatic, boolean isDiesel) {
        super(engine, model, price);
        this.isDiesel = isDiesel;
        this.isAutomatic = isAutomatic;
    }

    @Override
    protected FourWheeler clone() throws CloneNotSupportedException {
        return (FourWheeler)super.clone();
    }
}
