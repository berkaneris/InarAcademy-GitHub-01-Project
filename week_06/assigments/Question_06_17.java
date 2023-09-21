package week_06.assigments;

import java.util.Scanner;

public class Question_06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int num = input.nextInt();
        printMatrix(num);
    }
    public static void printMatrix(int n){
        for (int i = 0; i < n; i++){
            for (int k = 0 ; k < n ; k++){
                int number = (int)(Math.random() * 2);
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
