package week_08.assigments;

import java.util.Scanner;

public class Question_08_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a[00], a[01], a[10], a[11]: ");
        double[][] a = new double[2][2];
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                a[row][column] = input.nextDouble();
            }
        }
        System.out.print("Enter b[0] , b[1]: ");
        double[] b = new double[2];
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextDouble();
        }

        double[] result = linearEquation(a, b);

        if (result[2] == -1) {
            System.out.println("The equation has no solution.");
        } else {
            System.out.println("x is: " + result[0] + " y is: " + result[1]);
        }

    }

    public static double[] linearEquation(double[][] a, double[] b) {
        double[] result = new double[3];
        double divider = (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        if (divider == 0) {
            result[2] = -1;
            return result;
        }

        result[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / divider;
        result[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / divider;
        return result;

    }
}
