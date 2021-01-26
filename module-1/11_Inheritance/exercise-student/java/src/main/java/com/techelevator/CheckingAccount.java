package com.techelevator;

public class CheckingAccount extends BankAccount {


    //instance variable


    //constructor
    public CheckingAccount(String accountHolderName,
                           String accountNumber,
                           int balance) {

        super(accountHolderName, accountNumber, balance);

    }

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    //methods

    @Override
    public int withdraw(int amountToWithdraw) {
        int tempDecisionVariable = super.getBalance() - amountToWithdraw;
        if (tempDecisionVariable < -100) {
            System.out.println("Your transaction failed> Your current balance is " + super.getBalance());
        }
        if (tempDecisionVariable > -100 &&
                tempDecisionVariable < 0) {
            amountToWithdraw = amountToWithdraw + 10;
            super.withdraw(amountToWithdraw);
        }
        if(tempDecisionVariable >=0){
            super.withdraw(amountToWithdraw);
        }
        return super.getBalance();
    }
}
