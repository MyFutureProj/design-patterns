package com.designpatterns.structural.facade;

/**
 * @author Ravi Panchal
 */
public class FoodDeliveryApp {

    private Bomato bomato;
    private Swaggy swaggy;

    public FoodDeliveryApp(){
        bomato = new Bomato();
        swaggy = new Swaggy();
    }

    public void orderOnBomato(){
        bomato.placeOrder();
        bomato.prepare();
        bomato.deliver();
    }

    public void orderOnSwaggy(){
        swaggy.placeOrder();;
        swaggy.prepare();
        swaggy.deliver();
    }

}
