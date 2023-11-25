package week_07.assigments;

import java.util.Scanner;

public class Question_07_04_01 {
    public static void main(String[] args) {

        int [] scores = new int[101];
        int sumScores = sum (scores);
        int numberOfScores = numberOfScores(scores);
        double average = (double)sumScores / numberOfScores;
        display(average , scores);
    }
    public static int sum (int [] array){
        Scanner input = new Scanner(System.in);
        int sumScores = 0;
        boolean isPositive = true;
        System.out.print("Enter the score: ");

        while(isPositive){
            int score = input.nextInt();
            if (score < 0){
                isPositive = false;
            }else{
                sumScores += score;
                array[score]++;
            }
        }
        return sumScores;
    }
    public static int numberOfScores (int [] array){
        int numberOfScores = 0;
        for (int i = 0; i < array.length; i++){
            numberOfScores += array[i];
        }
        return numberOfScores;
    }
    public static void display( double average , int [] array){
       int a = 0;
       int b = 0;
       int c = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0){
                if (i > average){
                    a += array[i];
                }else if (i == average){
                    b += array[i];
                }else{
                    c += array[i];
                }
            }
        }
        System.out.println("\nAverage of scores: " + average + "\n"
                + "Number of scores above or equal to average: " + (a + b) + "\n"
                + "Number of scores below average: " + c);
    }
}
