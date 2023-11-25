package week_05.assigments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        double score = 0;
        int count = 0;
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        if (numberOfStudents <= count){
            System.out.println("The number of students is invalid ");
            System.exit(1);
        }
        else{
            System.out.print("Enter the name of " + (count + 1) + ". student: " );
            name = input.nextLine();
            System.out.print("Enter the score of " + (count + 1) + ". student: " );
            score = input.nextInt();
            input.nextLine();
            count++;
        }
        while (count < numberOfStudents){
            System.out.print("Enter the name of " + (count + 1) + ". student: " );
            String name1 = input.nextLine();
            System.out.print("Enter the score of " + (count + 1) + ". student: " );
            int score1 = input.nextInt();
            input.nextLine();

            if (score1 > score){
                name = name1;
                score = score1;
            }
            count++;
        }
        System.out.println("The student is " + name + " with the highest score " + score);
    }
}
