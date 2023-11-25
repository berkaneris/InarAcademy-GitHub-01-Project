package week_07.assigments;

import java.util.Scanner;

public class Question_07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a,b and c: ");
        double [] coefficient = new double[3];
        double [] root = new double[2];
        for(int i=0; i < coefficient.length; i++){
            coefficient[i] = input.nextDouble();
        }
        System.out.println("The number of real roots is " + solveQuadratic(coefficient , root));

            if (solveQuadratic(coefficient , root) > 1){
                System.out.printf("The equation has two roots %.1f and %.1f" , root[0] , root[1]);
                System.out.println();
            }else if (solveQuadratic(coefficient , root) == 1){
                System.out.printf("The equation has one root %.0f" , root[0]);

            }else {
                System.out.println("The equation has no real roots");
            }

    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        int numberOfRoots = 0;
        final double DISCRIMINANT = Math.pow(b , 2) - (4 * a * c);

        if (DISCRIMINANT > 0) {
            roots[0] = (-b + Math.pow(DISCRIMINANT, 0.5)) / (2 * a);
            roots[1] = (-b - Math.pow(DISCRIMINANT, 0.5)) / (2 * a);
            numberOfRoots = 2;
        }
        else if (DISCRIMINANT == 0) {
            roots[0] = -b / (2*a);
            numberOfRoots = 1;
        }
       return numberOfRoots;
    }

}
