package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public class Dog implements Animal{
    @Override
    public String getAnimal() {
        return "Dog: Ronny";
    }

    @Override
    public String makeSound() {
        return "Bark: Bhoww bhowwww";
    }
}
