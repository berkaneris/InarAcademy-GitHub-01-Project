package week_08.assigments;

public class Question_08_10 {
    public static void main(String[] args) {
        int [][] matrix = getMatrix();


        int largestRowIndex = getLargestRowIndex(matrix);
        int largestColumnIndex = getLargestColumnIndex(matrix);

        printMatrix(matrix);
        
        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The largest column index: " + largestColumnIndex);
    }
    public static int[][] getMatrix(){
        int [][] matrix = new int[4][4];
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = (int)(Math.random() * 2);
            }
        }
        return matrix;
    }
    public static int getLargestRowIndex(int [][] matrix){
        int countForOne = 0;
        int numberOfOne = 0;
        int largestRowIndex = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                if(matrix[row][column] == 1){
                    countForOne++;
                }
            }
            if(countForOne > numberOfOne){
                numberOfOne = countForOne;
                largestRowIndex = row;
            }
            countForOne = 0;
        }
        return largestRowIndex;
    }
    public static int getLargestColumnIndex(int [][] matrix){
        int countForOne = 0;
        int numberOfOne = 0;
        int largestColumnIndex = 0;
        for(int column = 0; column < matrix[0].length; column++){
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][column] == 1){
                    countForOne++;
                }
            }
            if(countForOne > numberOfOne){
                numberOfOne = countForOne;
                largestColumnIndex = column;
            }
            countForOne = 0;
        }
        return largestColumnIndex;
    }
    public static void printMatrix(int [][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[row].length; column++){
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
