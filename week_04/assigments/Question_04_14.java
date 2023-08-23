package week_04.assigments;

import java.util.Scanner;

public class Question_04_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String letterGrade = input.nextLine();

        if (letterGrade.length() != 1){
            System.out.println("The input is invalid.");
            System.exit(1);
        }
        char ch = letterGrade.charAt(0);

        if (('A' <= ch && ch <= 'F') && ch != 'E') {
            if (letterGrade.equals("A")){
                System.out.println("The numeric value for grade " + letterGrade + " is 4");
            }else if (letterGrade.equals("B")){
                System.out.println("The numeric value for grade " + letterGrade + " is 3");
            }else if (letterGrade.equals("C")){
                System.out.println("The numeric value for grade " + letterGrade + " is 2");
            }else if (letterGrade.equals("D")){
                System.out.println("The numeric value for grade " + letterGrade + " is 1");
            }else if (letterGrade.equals("F")){
                System.out.println("The numeric value for grade " + letterGrade + " is 0");
            }
        }
        else {
            System.out.println("The input is invalid.");
        }
    }
}
