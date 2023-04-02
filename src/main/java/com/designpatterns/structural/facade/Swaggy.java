package com.designpatterns.structural.facade;

/**
 * @author Ravi Panchal
 */
public class Swaggy implements FoodOrder{
    @Override
    public void placeOrder() {
        System.out.println("Swaggy: Order placed");
    }

    @Override
    public void prepare() {
        System.out.println("Swaggy: Preparing order");
    }

    @Override
    public void deliver() {
        System.out.println("Swaggy: Delivering order");
    }
}
