package com.techelevator;

public class BankAccount {

    private final String accountHolderName;
    private final String accountNumber;
    private int balance;


    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public BankAccount(String accountHolderName, String accountNumber, int balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getters and setters


    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    //methods

    public int deposit(int amountToDeposit){
        balance = balance + amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        return balance;
    }
}
