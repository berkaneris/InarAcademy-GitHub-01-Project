package week_09.assigments;

import week_09.assigments.classes.QuadraticEquation;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a , b , c);

        if(quadraticEquation.getDiscriminant() > 0){
            System.out.printf("The equation has two roots %.3f and %.3f" , quadraticEquation.getRoot1() ,
                                quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.printf("The equation has one root %.1f" , quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has no real roots");
        }

    }
}
