package week_03.assigments;

import java.util.Scanner;

public class Question_03_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble(); // taking a
        double b = input.nextDouble(); // taking b
        double c = input.nextDouble(); // taking c

      final double DİSCRİMİNANT = Math.pow(b , 2) - (4 * a * c);

      if (DİSCRİMİNANT > 0) {
          double root1 = (-b + Math.pow(DİSCRİMİNANT, 0.5)) / (2 * a);
          double root2 = (-b - Math.pow(DİSCRİMİNANT, 0.5)) / (2 * a);
          System.out.println("The equation has two roots " + (int)(root1 * 100000) / 100000.0 + " and " + (int)(root2 * 100000) / 100000.0);
      }
      else if (DİSCRİMİNANT == 0) {
          double root = -b / (2*a);
          System.out.println("The equation has one root " + root);
      }
      else {
          System.out.println("The equation has no real roots");
      }
      input.close();
    }
}
