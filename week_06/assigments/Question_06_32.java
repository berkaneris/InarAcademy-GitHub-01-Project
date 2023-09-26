package week_06.assigments;

import java.util.Scanner;

public class Question_06_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int countWin = 0;
        while (count < 10000) {
            int dice1 = dice1();
            int dice2 = dice2();
            int sum = sumOfDices(dice1, dice2);
            System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
            if (sum == 7 || sum == 11) {
                System.out.println("You win");
                countWin++;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You lose");
            } else {
                System.out.println("point is " + sum);
                int point = sum;
                sum = 0;
                while (sum != 7 && sum != point) {
//                    String enter = input.nextLine();
                    dice1 = dice1();
                    dice2 = dice2();
                    sum = sumOfDices(dice1, dice2);
                    System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
                }

                if (sum == 7) {
                    System.out.println("You lose");
                    count++;
                } else {
                    System.out.println("You win");
                    countWin++;
                }

            }
            count++;
        }
        System.out.println("The number of wins " + countWin);
    }

    public static int sumOfDices(int number1, int number2) {
        return number1 + number2;
    }

    public static int dice1() {
        return (int) (Math.random() * 5 + 1);
    }

    public static int dice2() {
        return (int) (Math.random() * 5 + 1);
    }
}
