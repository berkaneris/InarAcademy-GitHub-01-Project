package week_11.assigments;

import week_09.assigments.Account;

public class TestAccounts {
    public static void main(String[] args) {

        Account savingAccounts = new SavingAccounts(16,4820);
        Account checkingAccount = new CheckingAccount(11,1450);
        

        System.out.println(checkingAccount + "\n--------------------\n" + savingAccounts);
    }
}
