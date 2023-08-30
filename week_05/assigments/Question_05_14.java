package week_05.assigments;

import java.util.Scanner;

public class Question_05_14 {
    public static void main(String[] args) {
        // Create a Scanner
         Scanner input = new Scanner(System.in);

         // Prompt the user to enter two integers
         System.out.print("Enter first integer: ");
         int n1 = input.nextInt();
         System.out.print("Enter second integer: ");
         int n2 = input.nextInt();
         int d = Math.min(n1 , n2);

         int gcd = 1; // Initial gcd is 1
         boolean value = true;
         while (value) {
             if (n1 % d == 0 && n2 % d == 0) {
                 gcd = d; // Update gcd
                 value = false;
             }
             d--;
             }

         System.out.println("The greatest common divisor for " + n1 +
                 " and " + n2 + " is " + gcd);
    }
}
