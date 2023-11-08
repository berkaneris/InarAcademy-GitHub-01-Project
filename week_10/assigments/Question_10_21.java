package week_10.assigments;

import java.math.BigInteger;

public class Question_10_21 {
    public static void main(String[] args) {
        final int NUMBER_OF_50_DECIMAL_DIGIT = 10;
        int count = 0;


        BigInteger a = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);


        System.out.println("First ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6:");
        while (count < NUMBER_OF_50_DECIMAL_DIGIT){
            if(a.mod(new BigInteger("5")).equals(new BigInteger("0")) || a.mod(new BigInteger("6")).equals(new BigInteger("0"))){
                System.out.println(a);
                count++;
            }
            a = a.add(new BigInteger("1"));
        }
    }
}
