package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public class Blue implements Colour{
    @Override
    public String colourName() {
        return "Colour: Blue";
    }

    @Override
    public String shade() {
        return "Shade: Light blue";
    }
}
