package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public class Cat implements Animal{
    @Override
    public String getAnimal() {
        return "Cat: Shimu";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
