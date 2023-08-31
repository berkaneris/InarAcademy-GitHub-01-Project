package week_05.assigments;

import java.util.Scanner;

public class Question_05_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();
        int line = number * 3;

        for (int i = 1 ; i <= number ;i ++){
            System.out.printf("%" + line + "s" , "");
            for (int k = i  ; 1 <= k  ; k --){
                System.out.printf("%3d",k );
            }
            for (int l = 2 ; l <= i ; l ++){
                System.out.printf("%3d",l );
            }

            System.out.println();
            line -= 3;
        }
    }
}

