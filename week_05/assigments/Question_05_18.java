package week_05.assigments;

import java.util.Scanner;

public class Question_05_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int number = input.nextInt();

        for (int i = number ; 1 <= i ; i--){
            for (int k = 1 ; k <= i ; k ++ ){
                System.out.printf("%2d" , k );
            }
            System.out.println();
        }
        for (int i = 1 ; i <= number ; i++){
            for (int k = 1 ; k <= i ; k ++ ){
                System.out.printf("%2d" , k );
            }
            System.out.println();
        }
        int line = 2 * (number -1) + 1;
        for (int i = 1 ; i <= number ; i++){
            System.out.printf("%" + line + "s" ,"" );
            line -= 2;
            for (int k = i ; 1 <= k ; k -- ){
                System.out.printf("%2d" , k );
            }
            System.out.println();
        }
        int line1 = 1;
        for (int i = number ; 1 <= i ; i--){
            System.out.printf("%" + line1 + "s" ,"" );
            line1 += 2;
            for (int k = 1 ; k <= i ; k ++ ){
                System.out.printf("%2d" , k );
            }
            System.out.println();
        }
    }

}
