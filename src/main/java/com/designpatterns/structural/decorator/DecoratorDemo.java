package com.designpatterns.structural.decorator;

/**
 Allows for the dynamic addition of new
 behavior to an existing object without
 changing its structure.
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza = new CheeseDecorator(new PaneerDecorator(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
