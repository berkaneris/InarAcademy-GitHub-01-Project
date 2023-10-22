package week_08.assigments;

import java.util.Arrays;
import java.util.Scanner;

public class Question_08_20 {
    public static void main(String[] args) {
        String [][] disks = new String[6][7];
        String disk = " ";
        for(int i = 0; i < disks.length; i++){
            Arrays.fill(disks[i] , disk);
        }

        boolean control = true;
        int count = 0;
        while(control) {
            printGameTable(disks);
            askForDisk(disks , count);
            if(isFinish(disks)){
                control = false;
            }
            count++;


        }
    }
    public static void printGameTable(String [][] array){

        for(int i = 0; i < 6; i++){
            for (int k = 0 ; k < 7 ; k++){
                System.out.print("|");
                System.out.print(array[i][k]);
            }
            System.out.print("|");
            System.out.println();

        }
        System.out.println("---------------");


    }
    public static void askForDisk(String[][] array , int count){
       Scanner input = new Scanner(System.in);
       int number;
       String str ;
        if(count % 2 == 0){
            System.out.print("Drop a red disk at column (0–6): ");
             number = input.nextInt();
             str = "R";
        }else{
            System.out.print("Drop a yellow disk at column (0–6): ");
            number = input.nextInt();
            str = "Y";
        }
        for(int i = array.length -1; 0 <= i; i--){
            if(array[i][number].equals(" ") && str.equals("R")){
                array[i][number] = "R";
                break;
            }else if (array[i][number].equals(" ") && str.equals("Y")){
                array[i][number] = "Y";
                break;
            }
        }
    }
    public static boolean isFinish(String [][] array){
        if(isRowFinish(array) || isColumnFinish(array) || isDiagonalFinish(array) || isGameDraw(array)){
            return true;
        }
        return false;
    }
    public static boolean isRowFinish(String [][] array){
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length - 3 ; column++){
                int count = 0;
                for(int i = column + 1; i < column + 4; i++ ){
                    if (array[row][column].equals(array[row][i])){
                        count++;
                    }
                }
                if(count == 3 && array[row][column].equals("R")){
                    printGameTable(array);
                    System.out.println("The red player won");
                    return true;
                }else if(count == 3 && array[row][column].equals("Y")){
                    printGameTable(array);
                    System.out.println("The yellow player won");
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean isColumnFinish(String [][] array){
        for(int column = 0; column < array[0].length; column++){
            for(int row = 0; row < array.length - 3; row++){
                int count = 0;
                for(int i = row + 1; i < row + 4; i++ ){
                    if (array[row][column].equals(array[i][column])){
                        count++;
                    }
                }
                if(count == 3 && array[row][column].equals("R")){
                    printGameTable(array);
                    System.out.println("The red player won");
                    return true;
                }else if(count == 3 && array[row][column].equals("Y")){
                    printGameTable(array);
                    System.out.println("The yellow player won");
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isDiagonalFinish(String [][] array){
        for(int row = 3; row < array.length; row++) {
            int count = 0;
            for (int i = row, k = 0; 1 <= i ; i--, k++) {
                if(array[i][k].equals(array[i - 1][k + 1])){
                    count++;
                    if(count == 3 && array[i][k].equals("R")){
                        printGameTable(array);
                        System.out.println("The red player won");
                        return true;
                    }else if(count == 3 && array[i][k].equals("Y")){
                        printGameTable(array);
                        System.out.println("The yellow player won");
                        return true;
                    }
                }else{
                    count = 0;
                }

            }
            count = 0;
            for(int i = (array.length - 1) - row, k = array[row].length - 1; i < array.length - 1; i++ , k--){
                if(array[i][k].equals(array[i + 1][k - 1])){
                    count++;
                    if(count == 3 && array[i][k].equals("R")){
                        printGameTable(array);
                        System.out.println("The red player won");
                        return true;
                    }else if(count == 3 && array[i][k].equals("Y")){
                        printGameTable(array);
                        System.out.println("The yellow player won");
                        return true;
                    }
                }else{
                    count = 0;
                }
            }
        }
        for(int row = 3; row < array.length; row++){
            int count = 0;
            for (int i = (array.length - 1) - row, k = 0; i < array.length - 1 ; i++, k++) {
                if(array[i][k].equals(array[i + 1][k + 1])){
                    count++;
                    if(count == 3 && array[i][k].equals("R")){
                        printGameTable(array);
                        System.out.println("The red player won");
                        return true;
                    }else if(count == 3 && array[i][k].equals("Y")){
                        printGameTable(array);
                        System.out.println("The yellow player won");
                        return true;
                    }
                }else{
                    count = 0;
                }

            }
            count = 0;
            for(int i = row , k = array[row].length - 1; 1 <= i; i--, k--){
                if(array[i][k].equals(array[i - 1][k - 1])){
                    count++;
                    if(count == 3 && array[i][k].equals("R")){
                        printGameTable(array);
                        System.out.println("The red player won");
                        return true;
                    }else if(count == 3 && array[i][k].equals("Y")){
                        printGameTable(array);
                        System.out.println("The yellow player won");
                        return true;
                    }
                }else{
                    count = 0;
                }
            }
        }
        return false;
    }

    public static boolean isGameDraw(String[][] array){
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                if(array[row][column].equals(" ")){
                    return false;
                }
            }
        }
        printGameTable(array);
        System.out.println("Game is draw");
        return true;
    }
}

//    isGameDraw(array)
