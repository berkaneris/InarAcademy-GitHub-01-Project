package week_12.assigments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Question_12_23 {
    public static void main(String[] args) {
        File file = new File("Salary.txt");

        try{
            String[] ranks = {"assistant" , "associate" , "full"};
            PrintWriter output = new PrintWriter(file);
            for(int i = 1; i <= 1000; i++){
              int number = (int)(Math.random() * 3);
              double salary = 0;
              switch (number){
                  case 0 : salary = 50000 + (Math.random() * 30000);break;
                  case 1 : salary = 60000 + (Math.random() * 50000);break;
                  case 2 : salary = 75000 + (Math.random() * 55000);
              }
              output.printf("FirstName%d LastName%d %s %.2f\n" , i , i, ranks[number] , salary);
            }
            output.close();
        }catch (IOException ex){
            System.out.println();
        }
    }
}
