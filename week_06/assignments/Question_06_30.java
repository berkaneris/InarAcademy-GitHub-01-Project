package week_06.assigments;

import java.util.Scanner;

public class Question_06_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dice1 = dice1();
        int dice2 = dice2();
        int sum = sumOfDices(dice1 , dice2);
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        if ( sum == 7 || sum == 11){
            System.out.println("You win");
        }else if (sum == 2 || sum == 3 || sum == 12){
            System.out.println("You lose");
        }else{
            System.out.print("point is " + sum);
            int point = sum;
            sum = 0;
             while (sum != 7 && sum != point){
                  String enter = input.nextLine();
                  dice1 = dice1();
                  dice2 = dice2();
                  sum = sumOfDices(dice1 , dice2);
                 System.out.print("You rolled " + dice1 + " + " + dice2 + " = " + sum);
             }
            System.out.println();
             if (sum == 7){
                 System.out.println("You lose");
             }else{
                 System.out.println("You win");
             }

        }

    }

    public static int sumOfDices (int number1 , int number2){
        return number1 + number2;
    }
    public static int dice1 (){
        return (int)(Math.random() * 6 + 1);
    }
    public static int dice2 (){
        return (int)(Math.random() * 6 + 1);
    }
}
