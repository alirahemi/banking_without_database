package com.company.classes;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Account {

    // Account's Attributes
    private String accountOwner;
    private String accountNumber;
    private double balance;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // List of Behaviors
    public Account(String accountOwner){
        this.accountOwner = accountOwner;
        this.accountNumber ="100024000" + Integer.toString ((int)(Math.random() * 2000)) ;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Your money (\u20ac" + amount + ") was deposited into the account successful.");
    }

    public void withdraw(double amount){
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Your money (\u20ac" + amount + ") was taken from the account successful.");
        } else {
            System.out.println("You can not take the money form your account.");
        }
    }

    public void transfer(double amount, Account destinationAccount){
        if (balance >= amount){
            destinationAccount.deposit(amount);
            balance = balance - amount;
            System.out.println("Your money (\u20ac" + amount + ") is transferred successful.");
        } else {
            System.out.println("You can not transfer the money form your account.");
        }
    }

    public String getAccountNumber(){
        return this.accountNumber + " account number" ;
    }

    public String getBalance(){
        return this.accountOwner + "'s current Balance with " + this.getAccountNumber() + " is: \u20ac" + this.balance;
    }
}
