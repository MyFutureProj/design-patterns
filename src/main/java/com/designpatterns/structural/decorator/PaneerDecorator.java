package com.designpatterns.structural.decorator;

/**
 * @author Ravi Panchal
 */
public class PaneerDecorator extends PizzaDecorator{
    public PaneerDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return pizza.bake() +" + "+ addPaneer();
    }

    public String addPaneer(){
        return "Paneer";
    }
}
