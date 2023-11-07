package week_10.assigments;

import java.math.BigInteger;

public class Question_10_16 {
    public static void main(String[] args) {

    final int NUMBER_OF_50_DECIMAL_DIGIT = 10;
    int count = 0;


    BigInteger a = new BigInteger("10").pow(49);



    while (count < NUMBER_OF_50_DECIMAL_DIGIT){
        if(a.mod(new BigInteger("2")).equals(new BigInteger("0")) || a.mod(new BigInteger("3")).equals(new BigInteger("0"))){
            System.out.println(a);
            count++;
        }
        a = a.add(new BigInteger("1"));
    }





    }
}
