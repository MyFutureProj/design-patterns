package com.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Ravi Panchal
 */
public abstract class PaymentHandler {
    protected PaymentHandler next;

    void setNext(PaymentHandler next){
        this.next = next;
    }

    public abstract void processPayment(double amount);
}
