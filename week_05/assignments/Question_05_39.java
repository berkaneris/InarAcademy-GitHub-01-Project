package week_05.assigments;

import java.util.Scanner;

public class Question_05_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baseSalary = 5000;
        System.out.println("Your base salary is $" + baseSalary);
        System.out.print("How much money do you want to earn in a year: ");
        double earn = input.nextDouble();
        double comission = 0;
        double salesAmount ;
        for (salesAmount = 0; comission < (earn - baseSalary); salesAmount++){
            if (0 <= salesAmount && salesAmount <= 5000 ){
                comission = salesAmount * 8 / 100;
            }else if (salesAmount <= 10000){
                comission =  5000 * 8.0 / 100 + (salesAmount - 5000) * 10 / 100;
            }else{
                comission =  5000 * 8.0 / 100 + 5000 * 10.0 / 100 + (salesAmount - 10000) * 12 / 100;
            }
        }
        System.out.println("The sales that you should do is $" + salesAmount);
    }
}
