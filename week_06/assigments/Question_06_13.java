package week_06.assigments;

public class Question_06_13 {
    public static void main(String[] args) {
        System.out.println("i          m(i)       ");
        System.out.println("------------------------");
        for (int i = 1 ; i <= 20; i++){
            System.out.printf("%-11d%7.4f" , i , computeSeries(i));
            System.out.println();
        }
    }
    public static double computeSeries (int number){
        double sum = 0;
        for (double i = 1 ; i <= number; i++){
            sum += (i / (i + 1));
        }
        return sum;
    }
}
