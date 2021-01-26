package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    //methods


    @Override
    public int withdraw(int amountToWithdraw) {
        int tempDecisionVariable = super.getBalance() - amountToWithdraw;
        if (tempDecisionVariable < 150 && tempDecisionVariable >= 0) {
            super.withdraw(amountToWithdraw + 2);
        } else if (amountToWithdraw >= super.getBalance()) {
            return super.getBalance();
        } else {
            super.withdraw(amountToWithdraw);
        }
        return super.getBalance();
    }
}
