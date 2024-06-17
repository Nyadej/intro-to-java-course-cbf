package com.cbfacademy.accounts;

public class SavingsAccount extends Account {

  protected double interestRate;

  public SavingsAccount(int accountNumber, double balance, double interestRate) {
    super(accountNumber, balance);
    this.interestRate = interestRate;
  }

  public void applyInterest() {
    // deposit(super.getBalance() * this.interestRate);
    super.balance += super.balance * this.interestRate;
  }

  public double getInterestRate() {
    return this.interestRate;
  }

  public void setInterestRate(double interestRate) {
    if (interestRate >= 0) {
      this.interestRate = interestRate;
    }
  }

public double getBalance() {
  return super.getBalance();
}

}