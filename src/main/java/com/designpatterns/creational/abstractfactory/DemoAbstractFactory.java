package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public class DemoAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Animal");
        Dog dog = (Dog) abstractFactory.create("Dog");
        System.out.println(dog.getAnimal());
        System.out.println(dog.makeSound());

        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("Colour");
        Red red = (Red) abstractFactory1.create("Red");
        System.out.println(red.colourName());
        System.out.println(red.shade());

    }
}
