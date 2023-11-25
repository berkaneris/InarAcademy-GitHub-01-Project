package week_02.assigments;

import java.util.Scanner;

public class Question_02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityrate = input.nextDouble();
        double gratuity = subtotal / 100 * gratuityrate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $" + (int) (gratuity * 10) / 10.0 + " and total is $" + total);

    }
}
