package com.company;

import com.company.classes.Account;

public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("Ali");
        account1.deposit(200000);
        account1.withdraw(1000);

        Account account2 = new Account("Reza");
        account1.transfer(500,account2);

        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
    }
}
