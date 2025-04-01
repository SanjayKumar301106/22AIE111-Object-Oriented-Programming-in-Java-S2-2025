/*
 * Assignment: Implement a BankAccount class with deposit/withdraw functionality and overdraft protection.
 * */
package org.example;

// BankAccount.java
public class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        // TODO: Initialize balance
    }
    
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    
        // TODO: Add validation
    }
    
    public void withdraw(double amount) {
        // TODO: Add overdraft protection
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
    }
    
    public double getBalance() {
        return balance;
    }
}
