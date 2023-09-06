package week_05.assigments;

public class Question_05_25 {
    public static void main(String[] args) {
        double pi = 0;
        for (int i = 10000 ; i <= 100000 ; i += 10000){
            for (int k = 1 ; k <= i ; k ++){
                pi += 4 * (Math.pow((-1) , k + 1) / (2 * k - 1));
            }
            System.out.println(pi);
            pi = 0;
        }
    }
}
