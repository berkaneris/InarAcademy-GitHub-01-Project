package week_07.assigments;

import java.util.Scanner;

public class Question_07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[10];
        System.out.print("Enter ten numbers: ");

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        System.out.printf("The mean is %.2f%s" , mean(numbers) , "\n");
        System.out.printf("The standard deviation is %.5f" , deviation(numbers));
    }
    public static double deviation(double[] x){
       double deviation = 0;
       double sum = 0;
       for (int i= 0; i < x.length; i++){
           sum += Math.pow(x[i] - mean(x) , 2);
           deviation = Math.sqrt(sum / (x.length - 1));
       }
       return deviation;
    }
    public static double mean(double[] x){
        double sum = 0;
        for(int i=0; i < x.length; i++){
            sum += x[i];
        }
        return sum / x.length;
    }
}
