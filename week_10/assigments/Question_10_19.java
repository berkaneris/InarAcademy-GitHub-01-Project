package week_10.assigments;

import week_06.assigments.Question_06_26;

import java.math.BigInteger;

public class Question_10_19 {
    public static void main(String[] args) {
        System.out.println("p                    2^p-1");
        System.out.println("------------------------------");
        for (int i = 2; i <= 100; i++){
            if (isMersennePrime(i)){
                System.out.printf("%-21d%-5d" , i , new BigInteger("2").pow(i).subtract(new BigInteger("1")));
                System.out.println();
            }
        }
    }
    public static boolean isMersennePrime (int number){
        BigInteger checkNum = new BigInteger("2").pow(number).subtract(new BigInteger("1"));
        if (isPrimeNumber(checkNum) && Question_06_26.isPrimeNumber(number)){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isPrimeNumber(BigInteger number){


        for (BigInteger divider = new BigInteger("2"); !divider.equals(number.divide(BigInteger.TWO)); divider = divider.add(BigInteger.ONE)) {
            if (number.divide(divider).equals(BigInteger.ZERO)) {
                return false;
            }
        }
        return true;


    }
}
