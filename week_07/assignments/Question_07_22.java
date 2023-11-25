package week_07.assigments;

import java.util.Arrays;

public class Question_07_22 {
    public static void main(String[] args) {
        int [] number = generateSolution();
        while (!isSolution(number)) {
            number = generateSolution();
        }
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {
                if (k == number[i]) {

                        System.out.print("|Q");
                } else {
                        System.out.print("| ");
                }
            }

            System.out.println("|");
        }

    }
    public static boolean isSolution (int [] number){
        boolean isAnswer = true;


        for(int i = 0; i < number.length - 1; i++){
            for(int k = i + 1; k < number.length; k++){
                if(Math.abs(i - k) == Math.abs(number[i] - number[k])){
                    return false;
                }
            }
        }

        return  isAnswer;
    }
    public static int [] generateSolution (){
        int [] array = new int[8];
        for (int i = 0; i < array.length; i++)
            array[i] = i;

        // Shuffle the array
        for (int i = 0; i < array.length; i++) {
            // Generate an index randomly
            int index = (int)(Math.random() * array.length);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }
}
