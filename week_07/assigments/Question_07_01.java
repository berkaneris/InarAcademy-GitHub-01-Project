package week_07.assigments;

import java.util.Scanner;

public class Question_07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();
        double [] scores = new double[numOfStudents];
        System.out.print("Enter 4 scores: ");
        double bestScore = 0;
        for(int i = 0; i < scores.length; i++){
            scores [i] = input.nextDouble();
            if(scores[i] > bestScore){
                bestScore = scores[i];
            }
        }
        for (int i = 0; i < scores.length; i++){
            System.out.print("Student " + i + " score is " + (int)scores[i] + " and grade is ");
            if (scores[i] >= bestScore - 10){
                System.out.println("A");
            }else if (scores[i] >= bestScore - 20){
                System.out.println("B");
            }else if (scores[i] >= bestScore - 30){
                System.out.println("C");
            }else if (scores[i] >= bestScore - 40){
                System.out.println("D");
            }else{
                System.out.println("F");
            }
        }


    }
}
