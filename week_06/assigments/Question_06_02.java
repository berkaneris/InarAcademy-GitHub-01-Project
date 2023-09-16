package week_06.assigments;

public class Question_06_02 {
    public static void main(String[] args) {
        System.out.println(sumDigits(4587));
    }
    public static int sumDigits (long n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
