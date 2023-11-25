package week_05.assigments;

public class Question_05_12 {
    public static void main(String[] args) {

        double n = Math.sqrt(12500);

        while (n > Math.sqrt(12000)){
            n -= 0.1 ;
        }
         System.out.println(Math.round(n));



    }
}
