package week_06.assigments;

import java.util.Scanner;

public class Question_06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        System.out.print(number);
        if (isValid(number)) {
            System.out.println(" is valid");
        } else {
            System.out.println(" is invalid");
        }

    }

    public static boolean isValid(long number) {
        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;
        if (13 <= getSize(number) && getSize(number) >= 16){
            check1 = true;
        }
        if (prefixMatched(getPrefix(number , 1),4)
                ||prefixMatched(getPrefix(number , 1),5)
                ||prefixMatched(getPrefix(number , 2),37)
                ||prefixMatched(getPrefix(number , 1),6)){
            check2 = true;

        }
        if((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0){
           check3 = true;
        }
       return check1 && check2 && check3;
    }

    public static int sumOfDoubleEvenPlace(long number) {
        String str = number + "";
        int sum = 0;
        for (int i = str.length() - 2; 0 <= i; i -= 2) {
            int evenDigit = Integer.parseInt(str.charAt(i) + "");
            sum += getDigit(evenDigit * 2);
        }
        return sum;
    }

    public static int getDigit(int number) {
        int sum = 0;
        if (number / 10 == 0) {
            return number;
        } else {
            sum = (number % 10) + (number / 10);
            return sum;
        }
    }

    public static int sumOfOddPlace(long number) {
        String str = number + "";
        int sum = 0;
        for (int i = str.length() - 1; 0 <= i; i += -2) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int d) {
     String str1 = number + "";
     String str2 = d + "";
     if (str1.startsWith(str2)){
         return true;
     }
     else{
         return false;
     }
    }

    public static int getSize(long d) {
        String str = d + "";
        return str.length();
    }

    public static long getPrefix(long number, int k) {
        String str = number + "";
        String output = "";
        for (int i = 0; i < k; i++) {
            if (k <= str.length()) {
                output += str.charAt(i);
            } else {
                output = str;
            }
        }
        return Long.parseLong(output);
    }
}
