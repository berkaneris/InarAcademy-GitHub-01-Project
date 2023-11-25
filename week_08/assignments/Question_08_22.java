package week_08.assigments;

public class Question_08_22 {
    public static void main(String[] args) {
        int [][] matrix = new int[6][6];
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 2);
            }
        }
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        printStatusRows(matrix);
        printStatusColumns(matrix);

    }
    public static void printStatusRows(int [][] matrix){
        int totalRowNum = 0;
        for(int row = 0; row < matrix.length; row++){
            int count = 0;
            for(int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column] == 1){
                    count++;
                }
            }
            if(count % 2 == 0 && count != 0){
                totalRowNum++;
            }
        }
        if(totalRowNum == matrix.length){
            System.out.println("Every row have an even number of 1s");
        }else{
            System.out.println("Every row does not have an even number of 1s");
        }
    }
    public static void printStatusColumns(int [][] matrix){
        int totalColumnNum = 0;
        for(int column = 0; column < matrix[0].length; column++){
            int count = 0;
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][column] == 1){
                    count++;
                }
            }
            if(count % 2 == 0 && count != 0){
                totalColumnNum++;
            }
        }
        if(totalColumnNum == matrix.length){
            System.out.println("Every column have an even number of 1s");
        }else{
            System.out.println("Every column does not have an even number of 1s");
        }
    }
}
