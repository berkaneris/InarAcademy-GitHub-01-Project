package week_05.assigments;

public class Question_05_43 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 7; i++)  {
            for (int k = 2; k < 8 ; k++) {
                if (!(i == k || i > k)){
                    System.out.println(i + " " + k);
                    count++;
                }
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}
