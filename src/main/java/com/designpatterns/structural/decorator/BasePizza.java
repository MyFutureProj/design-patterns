package com.designpatterns.structural.decorator;

/**
 * @author Ravi Panchal
 */
public class BasePizza implements Pizza{
    @Override
    public String bake() {
       return "Baking base pizza with toppings: ";
    }
}
