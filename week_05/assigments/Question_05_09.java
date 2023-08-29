package week_05.assigments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        double score = 0;
        String name1 = "";
        double score1 = 0;
        int count = 0;
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        if (numberOfStudents <= count){
            System.out.println("The number of students is invalid ");
            System.exit(1);
        }
        else if (numberOfStudents == 1){
            System.out.print("Enter the name of " + (count + 1) + ". student: " );
            name = input.nextLine();
            System.out.print("Enter the score of " + (count + 1) + ". student: " );
            score = input.nextInt();
            input.nextLine();
            count++;
            System.out.println("The student is " + name+ " with the highest score " + score);
            System.exit(1);
        }else {
            System.out.print("Enter the name of " + (count + 1) + ". student: ");
            name = input.nextLine();
            System.out.print("Enter the score of " + (count + 1) + ". student: ");
            score = input.nextInt();
            input.nextLine();
            System.out.print("Enter the name of " + (count + 2) + ". student: ");
            name1 = input.nextLine();
            System.out.print("Enter the score of " + (count + 2) + ". student: ");
            score1 = input.nextInt();
            input.nextLine();
            count += 2;
            if (score1 > score) {
                String tempName = name;
                double tempScore = score;
                name = name1;
                score = score1;
                name1 = tempName;
                score1 = tempScore;

            }
        }
        while (count < numberOfStudents){
            System.out.print("Enter the name of " + (count + 1) + ". student: " );
            String name2 = input.nextLine();
            System.out.print("Enter the score of " + (count + 1) + ". student: " );
            double score2 = input.nextInt();
            input.nextLine();

             if (score2 > score ){
                score1 = score;
                name1 = name;
                score = score2;
                name = name2;

            } else if (score > score2 && score2 > score1 ) {
                score1 = score2;
                name1 = name2;

            }
            count++;
        }
        System.out.println("The student is " + name+ " with the highest score " + score);
        System.out.println("The student is " + name1+ " with the second-highest score " + score1);
    }
}
