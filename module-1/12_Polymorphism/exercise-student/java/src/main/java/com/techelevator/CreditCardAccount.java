package com.techelevator;

public class CreditCardAccount implements Accountable{


    private String accountHolder;
    private String accountNumber;
    private int debt;

    public CreditCardAccount(String accountHolder, String accountNumber){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int pay(int amountToPay){
        debt-= amountToPay;
        return debt;
    }
    public int charge(int amountToCharge){
        debt+= amountToCharge;
        return debt;
    }

    @Override
    public int getBalance() {
        return debt * -1;
    }
}
