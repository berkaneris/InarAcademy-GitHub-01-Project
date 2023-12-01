package week_13.assignments;

import week_13.assignments.Question_13_17.Complex;

import java.util.Scanner;

public class Question_13_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble(); // taking a
        double b = input.nextDouble(); // taking b
        double c = input.nextDouble(); // taking c

        final double DISCRIMINANT = Math.pow(b , 2) - (4 * a * c);

        if (DISCRIMINANT > 0) {
            double root1 = (-b + Math.pow(DISCRIMINANT, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(DISCRIMINANT, 0.5)) / (2 * a);
            System.out.printf("The roots are %f and %f" , root1  , root2 );
        }
        else if (DISCRIMINANT == 0) {
            double root = -b / (2*a);
            System.out.println("The root is " + root);
        }
        else {
            Complex root1 = new Complex(-b / (2*a), Math.sqrt(-1 * DISCRIMINANT) / (2*a));
            Complex root2 = new Complex(-b / (2*a) , -1 * Math.sqrt(-1 * DISCRIMINANT) / (2*a));
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        input.close();
    }
}