package week_05.assigments;

public class Question_05_06 {
    public static void main(String[] args) {
        final double RATE = 1.609;
        System.out.println("Miles          Kilometers   |   Kilometers          Miles");

        for (int i = 1 , k = 20; i < 10 && k < 65 ; i++ , k += 5) {
            System.out.printf("%-15d%-13.3f%s" , i , i * RATE , "|   ");
            System.out.printf("%-20d%.3f" , k , k / RATE);
            System.out.println();

        }
    }
}
