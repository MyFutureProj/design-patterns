package com.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Ravi Panchal
 */
public class DebitCardPaymentHandler extends PaymentHandler{
    @Override
    public void processPayment(double amount) {
        if(amount <= 10000){
            System.out.println("You can pay "+amount+" using Debit Card");
        }else{
            next.processPayment(amount);
        }
    }
}
