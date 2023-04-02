package com.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Ravi Panchal
 */
public class UPIPaymentHandler extends PaymentHandler{
    @Override
    public void processPayment(double amount) {
        if(amount<=1000){
            System.out.println("You can pay "+amount+" using UPI");
        }else{
            next.processPayment(amount);
        }
    }
}
