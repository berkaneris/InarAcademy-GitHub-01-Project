package week_05.assigments;

import java.util.Scanner;

public class Question_05_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String isbn = input.nextLine();
        double sum = 0;
        if (isbn.length() == 12){
            for (int i = 1; i <= 12 ; i++){
                if ( i % 2 == 0 && i < 12){
                    sum += (3 * Integer.parseInt(isbn.substring(i -1,i)));
                }else if (i < 12) {
                    sum += Integer.parseInt(isbn.substring(i - 1, i));
                }else{
                    sum += (3 * Integer.parseInt(isbn.substring(i -1)));
                }
            }
            sum = 10 - (sum) % 10;
            System.out.print("The ISBN-13 number is ");
            if (sum == 10){
                System.out.println(isbn + 0);
            }else {
                System.out.println(isbn + (int)sum);
            }
        }else {
            System.out.println(isbn + " is an invalid input");
        }
    }
}
