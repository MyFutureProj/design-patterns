package com.designpatterns.creational.abstractfactory;

/**
 * @author Ravi Panchal
 */
public class ColourFactory implements AbstractFactory<Colour>{
    @Override
    public Colour create(String type) {
        if(type.equals("Red")){
            return new Red();
        }else if(type.equals("Blue")){
            return new Blue();
        }
        return null;
    }
}
