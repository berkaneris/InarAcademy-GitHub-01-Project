package week_07.assigments;

import java.util.Scanner;

public class Question_07_03 {
    public static void main(String[] args) {
// create an array for numbers 1 - 100
// read the numbers from user
// count the occurrences of the number in the array
// display the results
        Scanner input = new Scanner(System.in);
        int [] countOccurrences = new int[100];
        System.out.print("Enter the integers between 1 and 100: ");
        boolean isZero = true;

        while (isZero){
            int number = input.nextInt();
            if (number == 0){
                isZero = false;
            }else{
              countOccurrences[number - 1]++;
            }
        }
        for (int i = 0; i < countOccurrences.length; i++){
            if (countOccurrences[i] > 0){
                System.out.print((i + 1) + " occurs " + countOccurrences[i] );
                if (countOccurrences[i] == 1){
                    System.out.println(" time");
                }else{
                    System.out.println(" times");
                }
            }
        }

    }
}
