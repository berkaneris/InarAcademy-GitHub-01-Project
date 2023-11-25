package week_12.assignments.Question_12_31;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_31 {
    public static void main(String[] args) {
        ArrayList<String> males = new ArrayList<>();
        ArrayList<String> females = new ArrayList<>();
        try {
            for (int i = 2010; i >= 2001; i--) {
                File file = new File("C:\\Users\\asus\\workspace\\inar-java\\src\\week_12\\assignments\\Question_12_31\\babynameranking" + i + ".txt");


                Scanner input = new Scanner(file);
                int count = 0;
                while (input.hasNext() && count < 5) {
                    input.next();
                    males.add(input.next());
                    input.next();
                    females.add(input.next());
                    input.next();
                    count++;
                }
                input.close();

            }
            System.out.println("------------------------------------------------------------------------------------------------------------------");
            System.out.printf("%-7s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s%-11s\n" , "Year" , "Rank 1" , "Rank 2", "Rank 3", "Rank 4", "Rank 5", "Rank 1", "Rank 2", "Rank 3", "Rank 4", "Rank 5");
            System.out.println("------------------------------------------------------------------------------------------------------------------");

            for (int i = 2010 , k = 5; i >= 2001 && k <= 50; i--, k+=5) {
                System.out.printf("%-7d",i);
                for(int l = k - 5; l < k; l++){
                    System.out.printf("%-11s" , females.get(l));
                }
                for(int j = k - 5; j < k; j++){
                    System.out.printf("%-11s" , males.get(j));
                }
                System.out.println();
            }

        }catch (Exception ex) {
            System.out.println("This is an error.");
        }

    }
}
