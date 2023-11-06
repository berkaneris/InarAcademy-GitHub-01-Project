package week_10.assigments;

import week_09.assigments.Account;

import java.util.Scanner;

public class Question_10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true) {
            System.out.print("Enter an id: ");
            int idNum = input.nextInt();
            boolean idIsCorrect = false;

            for (int i = 0; i < accounts.length; i++) {
                if (idNum == accounts[i].getId()) {
                    idIsCorrect = true;
                    int choice;
                    do {
                        System.out.println();
                        printMainMenu();
                        System.out.print("Enter a choice: ");
                        choice = input.nextInt();
                        takeChoice(choice, accounts[i]);

                    } while (choice != 4);
                    System.out.println();
                }
            }
            if (!idIsCorrect) {
                System.out.println("Enter a correct id number.");
            }
        }
    }

    public static void printMainMenu() {
        System.out.println("Main menu" +
                "\n1: check balance" +
                "\n2: withdraw" +
                "\n3: deposit" +
                "\n4: exit");
    }

    public static void takeChoice(int choice, Account account) {
        Scanner input = new Scanner(System.in);
        double amount;
        switch (choice) {
            case 1:
                System.out.println("The balance is " + account.getBalance());
                break;
            case 2:
                System.out.print("Enter an amount to withdraw: ");
                amount = input.nextDouble();
                account.withdraw(amount);
                break;
            case 3:
                System.out.print("Enter an amount to deposit: ");
                amount = input.nextInt();
                account.deposit(amount);

        }
    }
}
