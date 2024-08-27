package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts; // create the list as an empty ArrayList

    public Bank() {
        this.accounts = new ArrayList<>(); // initialised the list as an empty ArrayList
    }

    public Account openAccount(String accountType, double initialbalance, double overdraftOrInterestRate) {
        Account newAccount;
        int accountNumber = accounts.size() + 1; // generate an account number

        if (accountType.equalsIgnoreCase("Savings")) {
            newAccount = new SavingsAccount(accountNumber, initialbalance, overdraftOrInterestRate);
        } else if (accountType.equalsIgnoreCase("Current")) {
            newAccount = new CurrentAccount(accountNumber, initialbalance, overdraftOrInterestRate);
        } else {
            throw new IllegalArgumentException("Invalid account type"); // handle invalid account types
        }

        accounts.add(newAccount); // add the new account ot the list
        return newAccount; // return the new account
        }
    }
