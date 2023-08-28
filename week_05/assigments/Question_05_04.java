package week_05.assigments;

public class Question_05_04 {
    public static void main(String[] args) {
        final double RATE = 1.609;
        System.out.println("Miles          Kilometers");

        for (int i = 1 ; i < 11 ; i++ ){
            System.out.printf("%-15d%.3f" , i , i * RATE);
            System.out.println();
        }
    }
}
