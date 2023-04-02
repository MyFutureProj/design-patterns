package com.designpatterns.structural.proxy;

/**
 * @author Ravi Panchal
 */
public class ATM implements Account{

    private BankAccount bankAccount;

    public ATM(){
        this.bankAccount = new BankAccount();
    }

    @Override
    public void withdraw(Integer amount) {
        bankAccount = new BankAccount();
        bankAccount.withdraw(amount);
    }

    @Override
    public void getAccountNumber() {
        bankAccount.getAccountNumber();
    }
}
