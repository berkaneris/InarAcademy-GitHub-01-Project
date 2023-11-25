package week_12.assigments.Question_12_04;

import java.util.Date;

public class LoanWithException {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public LoanWithException() {
        this(2.5, 1, 1000);
    }

    public LoanWithException(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0) {
            throw new IllegalArgumentException("This is not a valid value.");
        }
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if(annualInterestRate <= 0){
            throw new IllegalArgumentException("This is not a valid value.");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if(numberOfYears <= 0){
            throw new IllegalArgumentException("This is not a valid value.");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if(loanAmount <= 0){
            throw new IllegalArgumentException("This is not a valid value.");
        }
        this.loanAmount = loanAmount;

    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    public Date getLoanDate() {
        return loanDate;
    }
}
