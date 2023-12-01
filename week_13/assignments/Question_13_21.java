package week_13.assignments;

import week_13.Rational;

import java.util.Scanner;

public class Question_13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        Rational h = new Rational(b, -2 * a);
        Rational k = new Rational(c, 1).subtract(new Rational(a, 1).multiply(h.multiply(h)));

        System.out.println("h is " + h + " k is " + k);
    }
}
