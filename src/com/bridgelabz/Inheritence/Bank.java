package com.bridgelabz.Inheritence;

public class Bank{// ctrl+f = find and replace
    public static void main(String[] args) {
        Account currentAccount = new CurrentAccount(10000088);
        currentAccount.setAccountBalance("76876787878789");
        currentAccount.setAccountHolderName("Satish");
        currentAccount.setAccountNumber("655768798990454565");
        Account savingAccount = new SavingAccount("784878989");
        System.out.println(currentAccount.toString());//
        savingAccount.setAccountBalance("76876787878789");
        savingAccount.setAccountHolderName("Satish");
        savingAccount.setAccountNumber("655768798990454565");
        System.out.println(savingAccount);
        currentAccount.debit(679798);
        savingAccount.debit(65787788);
        currentAccount.deposit(67677897);
        savingAccount.deposit(67889809);

    }
}
