package com.designpatterns.structural.proxy;

/**
 * @author Ravi Panchal
 */
public class ProxyDemo{
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.getAccountNumber();
        atm.withdraw(5000);
    }
}
