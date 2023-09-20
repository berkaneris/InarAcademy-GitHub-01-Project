package week_06.assigments;

public class Question_06_14 {
    public static void main(String[] args) {
        System.out.println("i                    m(i)     ");
        System.out.println("-------------------------------");
        for (int i = 1 ; i <= 901 ; i += 100){
            System.out.printf("%-21d%-9.4f" , i , computePi(i));
            System.out.println();
        }
    }
    public static double computePi (int number){
        double sum = 0;
        for (double i = 1 ; i <= number ; i++){
            sum += 4 * (Math.pow(-1 , i + 1) / (2 * i - 1));
        }
        return sum;
    }
}
