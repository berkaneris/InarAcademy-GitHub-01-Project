package week_10.assigments;

import java.math.BigInteger;

public class Question_10_17 {
    public static void main(String[] args) {
        double a = Long.MAX_VALUE;
        long b = (long)(Math.sqrt(a));
        int count = 0;

       BigInteger square = BigInteger.valueOf(b);
       BigInteger number = BigInteger.valueOf(Long.MAX_VALUE);

        System.out.println(number);
        while(count < 10){
           int result =  square.pow(2).compareTo(number);
           if(result > 0){
               System.out.println(square.pow(2));
               count++;
           }
               square = square.add(new BigInteger("1"));

        }
    }
}
