package com.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Ravi Panchal
 */
public class CreditCardPaymentHandler extends PaymentHandler{
    @Override
    public void processPayment(double amount) {
        if(amount <= 5000){
            System.out.println("You can pay "+amount+" using Credit Card");
        }else{
            next.processPayment(amount);
        }
    }
}
