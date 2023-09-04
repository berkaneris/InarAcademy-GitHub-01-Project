package week_05.assigments;

public class Question_05_23 {
    public static void main(String[] args) {
        double total1 = 0;
        double total2 = 0;

        for (int i = 1 ; i <= 50000 ; i ++){
            total1 += (1.0 / i);
        }
        System.out.println(total1);

        // The process 2 is more accurate than process 1.
        for (int i = 50000 ; 1 <= i ; i--){
            total2 += (1.0 / i);
        }
        System.out.println(total2);
    }
}
