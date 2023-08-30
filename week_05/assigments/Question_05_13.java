package week_05.assigments;

public class Question_05_13 {
    public static void main(String[] args) {
        double n = 1;
        while (n < Math.pow(12000 , 1.0/3)) {
            n += 0.1;
        }
        System.out.println((int)Math.floor(n));

    }
}
