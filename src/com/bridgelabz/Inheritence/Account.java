package com.bridgelabz.Inheritence;

public class Account {// every java class extends object class
    private String accountNumber;
    private String accountHolderName;
    private String AccountBalance;

    public void deposit(long amount){
        System.out.println("deposit..........");
    }

    public void debit(long amount){
        System.out.println("debit.............");
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        AccountBalance = accountBalance;
    }
    @Override
    public String toString() {//value print
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", AccountBalance='" + AccountBalance + '\'' +
                '}';
    }

}
