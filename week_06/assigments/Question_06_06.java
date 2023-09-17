package week_06.assigments;

import java.util.Scanner;

public class Question_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        displayPattern(number);
    }
    public static void displayPattern (int n){

      for (int i = 1 ; i <= n; i++){
          for(int k = 0; k < n - i; k++){
              System.out.print("  ");
          }
          for (int k = i; 1 <= k ; k--){
              System.out.printf("%-2d" , k);
          }
          System.out.println();

      }
    }
}
