package week_10.assigments;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Question_10_20 {
    public static void main(String[] args) {
        System.out.println(" The e values for i = 100 to 1000: ");
        System.out.println(" i                e");
        System.out.println("-----------------------------------");

        for(int i = 100; i <= 1000; i += 100){
            BigDecimal e = BigDecimal.valueOf(1);
            BigDecimal item = BigDecimal.valueOf(1);
            for (int k = 1 ; k <= i; k++){
                item = item.divide(BigDecimal.valueOf(k), 25 , RoundingMode.CEILING);
                e = e.add(item);
            }
            System.out.printf("%-8d",i );
            System.out.println(e);

        }
    }
}

