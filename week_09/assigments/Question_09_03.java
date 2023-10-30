package week_09.assigments;

import java.util.Date;

public class Question_09_03 {
    public static void main(String[] args) {
        Date date = new Date();

        for(int p = 4 ; p < 12 ; p++){
            long num = (long)(Math.pow(10 , p));
            date.setTime(num);
            System.out.println("For elapsed " + num + " time is " + date.toString());
        }

    }
}
