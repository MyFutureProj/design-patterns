package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public class AnimalFactory implements AbstractFactory<Animal>{
    @Override
    public Animal create(String type) {
        if(type.equals("Dog")){
            return new Dog();
        }else if(type.equals("Cat")){
            return new Cat();
        }
        return null;
    }
}
