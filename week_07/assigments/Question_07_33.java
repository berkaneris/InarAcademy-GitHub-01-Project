package week_07.assigments;

import java.util.Scanner;

public class Question_07_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.print("Enter a year: ");
         String [] yearNames = new String[]{"Monkey" , "Rooster" , "Dog" , "Pig" , "Rat" ,"Ox" , "Tiger", "Rabbit",
                 "Dragon" , "Snake" , "Horse", "Sheep"};
         int year = input.nextInt();

        System.out.print(year + " is a year of " );

        for (int i = 0; i < yearNames.length; i++){
            if ((year % 12) == i){
                System.out.print(yearNames[i]);
            }
        }
        System.out.print(" in zodiac");
    }

}
