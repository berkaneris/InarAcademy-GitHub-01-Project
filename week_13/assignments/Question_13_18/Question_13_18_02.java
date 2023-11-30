package week_13.assignments.Question_13_18;

import week_13.assignments.Question_13_15.Rational2;

import java.math.BigInteger;

public class Question_13_18_02 {
    public static void main(String[] args) {
        Rational2 rational = new Rational2(BigInteger.ONE,BigInteger.TWO);

        for(BigInteger i = BigInteger.TWO; i.compareTo(new BigInteger("99")) != 1; i = i.add(BigInteger.ONE)){
            rational = rational.add(new Rational2(i , i.add(BigInteger.ONE)));
        }
        System.out.println(rational);
    }
}
