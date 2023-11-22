package week_12.assigments;

import java.io.File;
import java.io.IOException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question_12_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file's path name: ");
        String path = input.nextLine();

        File file = new File(path);

        double total = 0;
        double count = 0;
        try{
           input = new Scanner(file);

           while(input.hasNext()){
               total += input.nextDouble();
               count++;
           }
           input.close();
            System.out.println("Sum of the numbers in the file: " + total +
                               "\nNumber of integers: " +  count +
                               "\nAverage: " + (total / count));
        }catch (InputMismatchException | IOException ex){
            if(ex instanceof InputMismatchException){
                System.out.println("The input is not valid.");
            }else{
                System.out.println("The file cannot be read.");
            }
        }
    }
}
