package main.java;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private List<String> transactionHistory;

    public BankAccount() {
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    /**
     * Deposits a specified amount into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        transactionHistory.add("Deposited: $" + amount);
    }

    /**
     * Withdraws a specified amount from the bank account.
     *
     * @param amount the amount to withdraw
     * @throws IllegalArgumentException if the withdrawal amount is greater than
     *                                  the balance
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be"
                     + "positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
        transactionHistory.add("Withdrew: $" + amount);
    }

    /**
     * Retrieves the transaction history of the bank account.
     *
     * @return a string representation of the transaction history
     */
    public String getAccountHistory() {
        return String.join("\n", transactionHistory);
    }

    /**
     * Retrieves the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }
}