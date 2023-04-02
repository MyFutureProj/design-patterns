package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public class Red implements Colour{
    @Override
    public String colourName() {
        return "Colour: Red";
    }

    @Override
    public String shade() {
        return "Shade: Dark Red";
    }
}
