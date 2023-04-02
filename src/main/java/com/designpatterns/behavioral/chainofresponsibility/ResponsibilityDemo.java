package com.designpatterns.behavioral.chainofresponsibility;

/**
 * @author Ravi Panchal
 */
public class ResponsibilityDemo {
    public static void main(String[] args) {
        PaymentHandler creditCardPayment = new CreditCardPaymentHandler();
        PaymentHandler debitCardPayment = new DebitCardPaymentHandler();
        PaymentHandler upiPayment = new UPIPaymentHandler();

        upiPayment.setNext(creditCardPayment);
        creditCardPayment.setNext(debitCardPayment);

        upiPayment.processPayment(1000);
        upiPayment.processPayment(5000);
        upiPayment.processPayment(10000);

    }
}
