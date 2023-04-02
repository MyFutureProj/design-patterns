package com.designpatterns.structural.facade;

/**
 * @author Ravi Panchal
 */
public class Bomato implements FoodOrder{

    @Override
    public void placeOrder() {
        System.out.println("Zomato: Order Placed");
    }

    @Override
    public void prepare() {
        System.out.println("Zomato: Preparing Order");
    }

    @Override
    public void deliver() {
        System.out.println("Zomato: Delivering Order");
    }
}
