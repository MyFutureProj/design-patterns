package com.designpatterns.creational.factorypattern;

/**
 * @author Ravi Panchal
 */
public class ShapeFactory {

    public Shape getShape(String type) {
        if (type.equals("Circle")) {
            return new Circle();
        } else if (type.equals("Triangle")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}
