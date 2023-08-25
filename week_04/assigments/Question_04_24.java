package week_04.assigments;

import java.util.Scanner;

public class Question_04_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        System.out.print("The three cities in alphabetical order are ");

        if(city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0  && city2.compareTo(city3) < 0){
            System.out.println(city1 + " " + city2 + " " + city3);
        }else if(city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0  && city3.compareTo(city2) < 0){
            System.out.println(city1 + " " + city3 + " " + city2);
        }else if(city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0  && city1.compareTo(city3) < 0){
            System.out.println(city2 + " " + city1 + " " + city3);
        }else if(city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0  && city3.compareTo(city1) < 0){
            System.out.println(city2 + " " + city3 + " " + city1);
        }else if(city3.compareTo(city1) < 0 && city3.compareTo(city2) < 0  && city1.compareTo(city2) < 0){
            System.out.println(city3 + " " + city1 + " " + city2);
        }else if(city3.compareTo(city1) < 0 && city3.compareTo(city2) < 0  && city2.compareTo(city1) < 0){
            System.out.println(city3 + " " + city2 + " " + city1);
        }

    }
}
