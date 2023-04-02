package com.designpatterns.creational.builderpattern;

/**
 * @author Ravi Panchal
 */
public class DemoBuilder {
    public static void main(String[] args) {
        testBuilder();
    }

    private static void testBuilder() {
        /*
            Builder Pattern
        */
        Burger burger = new Burger.BurgerBuilder()
                .setSize("L")
                .setMeyo(true)
                .setCheese(true)
                .setPeriperi(false)
                .build();
        System.out.println(burger.toString());
    }
}
