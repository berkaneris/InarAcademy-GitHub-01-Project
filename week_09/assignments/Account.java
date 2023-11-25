package week_09.assigments.classes;

import java.util.Date;

public class Account {

    private int id ;
    private double balance ;
    private static double annualInterestRate ;
    private final Date dateCreated;

    public Account(){
        dateCreated = new Date();
    }
    public Account(int id , double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate / 100;
    }
    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return (getAnnualInterestRate() / 12) ;
    }
    public double getMonthlyInterest(){
        return (balance * getMonthlyInterestRate());
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    @Override
    public String toString(){
        return "You created an account.";
    }
}
