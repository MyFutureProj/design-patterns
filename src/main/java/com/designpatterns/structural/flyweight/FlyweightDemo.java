package com.designpatterns.structural.flyweight;

/**
 * Flyweight Design Pattern
 * Use the Flyweight pattern only when your program must support a huge number of objects which barely fit
 * into available RAM.
 *
 * @author Ravi Panchal
 */
public class FlyweightDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getCircle("Red");
        shape.draw();
        System.out.println("Hashcode Red: "+shape.hashCode());

        Shape shape2 = shapeFactory.getCircle("Red");
        System.out.println("Hashcode2 Red: "+shape2.hashCode());

        System.out.println("###########################");

        Shape shape3 = shapeFactory.getCircle("Green");
        shape3.draw();
        System.out.println("Hashcode Green: "+shape3.hashCode());

    }
}
