package week_05.assigments;


import java.util.Scanner;

public class Question_05_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double sum1 = 0;
        int i;
        System.out.print("Enter ten numbers: ");
        for (i = 0 ; i < 10 ; i++){
            double number = input.nextDouble();
            sum += number;
            sum1 += Math.pow(number , 2);

        }
        System.out.println("The mean is " + (sum/i));
        double deviation = Math.sqrt((sum1 - (Math.pow(sum , 2) / i)) / (i - 1));
        System.out.printf("The standard deviation is %.5f" , deviation);
    }
}
