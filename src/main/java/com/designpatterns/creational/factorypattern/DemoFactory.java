package com.designpatterns.creational.factorypattern;

/**
 * @author Ravi Panchal
 */
public class DemoFactory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Triangle");
        shape.draw();
    }
}
