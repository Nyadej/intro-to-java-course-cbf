package com.cbfacademy.accounts;

import java.util.ArrayList;

public class Bank extends Account {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }
    
}
