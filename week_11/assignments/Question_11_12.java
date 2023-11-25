package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        ArrayList<Double> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(input.nextDouble());
        }
        System.out.println("Sum of the list: " + sum(list));
    }
    public static double sum(ArrayList<Double> list){
       double sum = 0;

       for(int i = 0; i < list.size(); i++){
           sum += list.get(i);
       }
       return sum;
    }
}
