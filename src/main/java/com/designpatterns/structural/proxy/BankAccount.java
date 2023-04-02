package com.designpatterns.structural.proxy;

/**
 * @author Ravi Panchal
 */
public class BankAccount implements Account{
    @Override
    public void withdraw(Integer amount) {
        System.out.println("You have withdrawn Rs: "+amount);
    }

    @Override
    public void getAccountNumber() {
        System.out.println("Account number is: 1234567890");
    }
}
