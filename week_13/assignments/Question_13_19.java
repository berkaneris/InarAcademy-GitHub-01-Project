package week_13.assignments;

import week_13.assignments.Question_13_15.Rational2;

import java.math.BigInteger;
import java.util.Scanner;

public class Question_13_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String number = input.next();
        String [] parts = number.split(",");

        Rational2 token ;
        if(parts[0].contains("-")){
            parts[0] = parts[0].substring(1);
            token = new Rational2(new BigInteger("-1") , new BigInteger("1"));
        }else{
            token = new Rational2(new BigInteger("1") , new BigInteger("1"));
        }

        Rational2 rational1 = new Rational2(new BigInteger(parts[0]) , BigInteger.ONE);
        Rational2 rational2 = new Rational2(new BigInteger(parts[1]) , new BigInteger((int)(Math.pow(10 , parts[1].length())) + ""));
        System.out.println("The fraction number is " + rational1.add(rational2).multiply(token));


    }
}
