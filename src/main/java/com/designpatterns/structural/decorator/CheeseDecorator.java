package com.designpatterns.structural.decorator;

/**
 * @author Ravi Panchal
 */
public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String  bake(){
        return pizza.bake() +" + "+ addCheese();
    }

    public String addCheese(){
        return "Cheese";
    }

}
