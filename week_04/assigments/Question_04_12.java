package week_04.assigments;

import java.util.Scanner;

public class Question_04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit = input.nextLine();

        if (hexDigit.length() != 1){
            System.out.println("The input is invalid.");
            System.exit(1);
        }
        char ch = hexDigit.charAt(0);
        if ((ch <= 'F' && ch >= 'A') || ('1' <= ch && ch <= '9')) {
            System.out.print("The binary value is ");
            if (hexDigit.equals("0")) {
                System.out.println(hexDigit);
            } else if (hexDigit.equals("1")) {
                System.out.println(hexDigit);
            } else if (hexDigit.equals("2")) {
                System.out.println("10");
            } else if (hexDigit.equals("3")) {
                System.out.println("11");
            } else if (hexDigit.equals("4")) {
                System.out.println("100");
            } else if (hexDigit.equals("5")) {
                System.out.println("101");
            } else if (hexDigit.equals("6")) {
                System.out.println("110");
            } else if (hexDigit.equals("7")) {
                System.out.println("111");
            } else if (hexDigit.equals("8")) {
                System.out.println("1000");
            } else if (hexDigit.equals("9")) {
                System.out.println("1001");
            } else if (hexDigit.equals("A")) {
                System.out.println("1010");
            } else if (hexDigit.equals("B")) {
                System.out.println("1011");
            } else if (hexDigit.equals("C")) {
                System.out.println("1100");
            } else if (hexDigit.equals("D")) {
                System.out.println("1101");
            } else if (hexDigit.equals("E")) {
                System.out.println("1110");
            } else if (hexDigit.equals("F")) {
                System.out.println("1111");
            }

        }

        System.out.println(hexDigit + " is an invalid input");

    }
}
