package com.designpatterns.creational.factorypattern;

/**
 * @author Ravi Panchal
 */
public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Triangle: Draw method called");
    }
}
