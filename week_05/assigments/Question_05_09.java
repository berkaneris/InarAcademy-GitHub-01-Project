package week_05.assigments;

import java.util.Scanner;

public class Question_05_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameMax = "";
        double scoreMax = 0;
        String nameSecond = "";
        double scoreSecond = 0;
        int count = 0;
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();
        if (numberOfStudents <= count){
            System.out.println("The number of students is invalid ");
            System.exit(1);
        }
        else {
            while (count < numberOfStudents){
                System.out.print("Enter the name of " + (count + 1) + ". student: " );
                String name = input.nextLine();
                System.out.print("Enter the score of " + (count + 1) + ". student: " );
                double score = input.nextInt();
                input.nextLine();

                if (score > scoreMax ){
                    scoreSecond = scoreMax;
                    nameSecond = nameMax;
                    scoreMax = score;
                    nameMax = name;

                } else if ( score > scoreSecond ) {
                    scoreSecond = score;
                    nameSecond = name;

                }
                count++;
            }
        }
        if(numberOfStudents == 1){
            System.out.println("The student is " + nameMax+ " with the highest score " + scoreMax);
        }else{
            System.out.println("The student is " + nameMax+ " with the highest score " + scoreMax);
            System.out.println("The student is " + nameSecond+ " with the second-highest score " + scoreSecond);
        }
    }
}
