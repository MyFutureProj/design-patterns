package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public class FactoryProvider {
    public static AbstractFactory getFactory(String type){
        if(type.equals("Animal")){
            return new AnimalFactory();
        }else if (type.equals("Colour")){
            return new ColourFactory();
        }
        return null;
    }

}
