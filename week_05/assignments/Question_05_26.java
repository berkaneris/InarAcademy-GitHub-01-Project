package week_05.assigments;

public class Question_05_26 {
    public static void main(String[] args) {
        double e = 1;
        double item = 1;
        for (int i = 10000 ; i <= 100000 ; i += 10000){
            for (int k = 1 ; k <= i ; k++ ) {
                item /= k;
                e += item;
            }
            System.out.println(e);
            e = 1;
            item = 1;
        }
    }
}
