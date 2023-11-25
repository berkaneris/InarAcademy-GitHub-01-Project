package week_08.assigments;


import java.util.Arrays;
import java.util.Scanner;

public class Question_08_09 {
    public static void main(String[] args) {

        String[][] tokens = new String[3][3];
        String token = " ";
        for (int row = 0; row < tokens.length; row++) {
            Arrays.fill(tokens[row] , token);
//            for (int column = 0; column < tokens[row].length; column++) {
//                tokens[row][column] = token;
//            }
        }
        int count = 0;
        boolean control = false;
        while (!control) {
            printGameTable(tokens);
            askForTokens(tokens, count);
            if (isRowFinish(tokens) || isColumnFinish(tokens) || isDiagonalFinish(tokens) || isGameDraw(tokens)) {
                control = true;
            }
            count++;
        }
    }

    public static void printGameTable(String[][] str) {
        System.out.println("-------------------");
        for (int row = 0; row < str.length; row++) {
            for (int column = 0; column < str[row].length; column++) {
                System.out.print("|  ");
                System.out.print(str[row][column]);
                System.out.print("  ");
            }
            System.out.print("|");
            System.out.println();
            System.out.println("-------------------");
        }

    }

    public static void askForTokens(String[][] str, int count) {
        Scanner input = new Scanner(System.in);
        int row = -1;
        int column =-1;

        if (count % 2 == 0) {
            while((0 > row || row > 2) || (0 > column || column > 2)) {
                System.out.print("Enter a row (0, 1, or 2) for player X: ");
                row = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player X: ");
                column = input.nextInt();
                if ((0 > row || row > 2) || (0 > column || column > 2)) {
                    System.out.println("The value is not valid");
                }
            }
            if(isEmpty(str , row , column)) {
                str[row][column] = "X";
            }else{
                System.out.println("The place is not empty.");
                askForTokens(str , count);
            }

        } else {
            while((0 > row || row > 2) || (0 > column || column > 2)) {
                System.out.print("Enter a row (0, 1, or 2) for player 0: ");
                row = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player 0: ");
                column = input.nextInt();
                if ((0 > row || row > 2) || (0 > column || column > 2)) {
                    System.out.println("The value is not valid");
                }
            }
            if(isEmpty(str , row , column)) {
                str[row][column] = "O";
            }else{
                System.out.println("The place is not empty.");
                askForTokens(str , count);
            }

        }

    }


    public static boolean isRowFinish(String[][] array) {
        int countX = 0;
        int countO = 0;
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column].equals("X")) {
                    countX++;
                } else if (array[row][column].equals("O")) {
                    countO++;
                }
            }
            if (countX == 3) {
                printGameTable(array);
                System.out.println("X player won");
                return true;

            } else if (countO == 3) {
                printGameTable(array);
                System.out.println("O player won");
                return true;
            }
            countX = 0;
            countO = 0;
        }
        return false;

    }

    public static boolean isColumnFinish(String[][] array) {
        int countX = 0;
        int countO = 0;
        for (int column = 0; column < array[0].length; column++) {
            for (int row = 0; row < array.length; row++) {
                if (array[row][column].equals("X")) {
                    countX++;
                } else if (array[row][column].equals("O")) {
                    countO++;
                }
            }
            if (countX == 3) {
                printGameTable(array);
                System.out.println("X player won");
                return true;

            } else if (countO == 3) {
                printGameTable(array);
                System.out.println("O player won");
                return true;
            }
            countX = 0;
            countO = 0;
        }
        return false;
    }

    public static boolean isDiagonalFinish(String[][] array) {
        int countX = 0;
        int countO = 0;
        for (int i = 0, k = 0; i < array.length; i++, k++) {
            if (array[i][k].equals("X")) {
                countX++;
            } else if (array[i][k].equals("O")) {
                countO++;
            }
        }
        if (countX == 3) {
            printGameTable(array);
            System.out.println("X player won");
            return true;

        } else if (countO == 3) {
            printGameTable(array);
            System.out.println("O player won");
            return true;
        }

        countX = 0;
        countO = 0;
        for (int i = 0, k = array.length - 1; i < array.length; i++, k--) {
            if (array[i][k].equals("X")) {
                countX++;
            } else if (array[i][k].equals("O")) {
                countO++;
            }
        }
        if (countX == 3) {
            printGameTable(array);
            System.out.println("X player won");
            return true;

        } else if (countO == 3) {
            printGameTable(array);
            System.out.println("O player won");
            return true;
        }
        return false;
    }

    public static boolean isGameDraw(String[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (array[row][column].equals(" ")) {
                    return false;
                }
            }
        }
        printGameTable(array);
        System.out.println("It is a draw");
        return true;
    }

    public static boolean isEmpty (String[][] array , int row , int column){
        if(array[row][column].equals(" ")){
            return true;
        }
        return false;
    }
}