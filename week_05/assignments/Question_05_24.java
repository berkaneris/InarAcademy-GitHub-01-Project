package week_05.assigments;

public class Question_05_24 {
    public static void main(String[] args) {
        double total1 = 0;
        double total2 = 0;

        for (double i = 1 ; i <= 97 ; i += 2){
            total1 += ( i / (i + 2));
        }
        System.out.println(total1);
        for (double i = 97 ; 1 <= i ; i -= 2){
            total2 += ( i / (i + 2));
        }
        System.out.println(total2);

    }
}
