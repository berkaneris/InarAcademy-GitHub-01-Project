package week_09.assigments;

import week_09.assigments.classes.Account;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account(1122 , 20000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("             Account Statement :             ");
        System.out.println("---------------------------------------------");
        System.out.println("Account ID     : " + account.getId()
                         + "\nDate created   : " + account.getDateCreated()
                         + "\nBalance        : $" + account.getBalance()
                         + "\nMonthly Interest: $" + account.getMonthlyInterest());

    }
}
