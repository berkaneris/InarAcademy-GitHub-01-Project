package week_12.assigments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question_12_24 {
    public static void main(String[] args) {
        try{
//
            File file = new File("C:\\Users\\asus\\workspace\\inar-java\\Salary.txt");
            Scanner input = new Scanner(file);
            String rank;
            String[] ranks = {"assistant" , "associate" , "full"};
            double salary;
            double [] totalSalaries = new double[4];
            int [] counts = new int[4];
            while (input.hasNext()){
                input.next();
                input.next();
                rank = input.next();
                salary = input.nextDouble();
                for(int i = 0; i < ranks.length; i++){
                    if(rank.equalsIgnoreCase(ranks[i])){
                        totalSalaries[i] += salary;
                        counts[i]++;
                    }
                }
                totalSalaries[3] += salary;
                counts[3]++;
            }
            input.close();
            for(int i = 0; i < ranks.length; i++){
                System.out.printf("Total salary for %s professors: %.2f\n" , ranks[i] , totalSalaries[i]);
            }
            System.out.printf("Total salary for %s professors: %.2f\n" , "all faculty" , totalSalaries[3]);
            System.out.println("------------------------------------");
            for(int i = 0; i < ranks.length; i++){
                System.out.printf("Average salary for %s professors: %.2f\n" , ranks[i] , totalSalaries[i] / counts[i]);
            }
            System.out.printf("Average salary for %s professors: %.2f\n" , "all faculty" , totalSalaries[3] / counts[3]);
//
        }
//
        catch (IOException ex){
            System.out.println("I/O Exception");
        }
    }
}
