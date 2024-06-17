package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

public void setOverdraftLimit(double overdraftLimit) {
    this.overdraftLimit = overdraftLimit;    //  if (newOverdraftLimit >= 0)
}

public double getOverdraftLimit() {
    return overdraftLimit;
}

@Override
public double withdraw(double requested) {
    if (this.balance + this.overdraftLimit < requested || requested < 0) {
      return 0;
    } else {
      this.balance -= requested;
      return requested;
    }
  }



}
