package com.designpatterns.creational.factorypattern;

/**
 * @author Ravi Panchal
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle: Draw method called");
    }
}
