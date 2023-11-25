package week_04.assigments;

import java.util.Scanner;

public class Question_04_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();

        if (letter.length() != 1) {
            System.out.println("The input is invalid.");
        }
        char ch = letter.charAt(0);
        if (('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z')) {
            if (letter.equalsIgnoreCase("a") ||
                    letter.equalsIgnoreCase("b") ||
                    letter.equalsIgnoreCase("c")) {
                System.out.println("The corresponding number is 2");
            } else if (letter.equalsIgnoreCase("d") ||
                    letter.equalsIgnoreCase("e") ||
                    letter.equalsIgnoreCase("f")) {
                System.out.println("The corresponding number is 3");
            } else if (letter.equalsIgnoreCase("g") ||
                    letter.equalsIgnoreCase("h") ||
                    letter.equalsIgnoreCase("i")) {
                System.out.println("The corresponding number is 4");
            } else if (letter.equalsIgnoreCase("j") ||
                    letter.equalsIgnoreCase("k") ||
                    letter.equalsIgnoreCase("l")) {
                System.out.println("The corresponding number is 5");
            } else if (letter.equalsIgnoreCase("m") ||
                    letter.equalsIgnoreCase("n") ||
                    letter.equalsIgnoreCase("o")) {
                System.out.println("The corresponding number is 6");
            } else if (letter.equalsIgnoreCase("p") ||
                    letter.equalsIgnoreCase("q") ||
                    letter.equalsIgnoreCase("r") ||
                    letter.equalsIgnoreCase("s")) {
                System.out.println("The corresponding number is 7");
            } else if (letter.equalsIgnoreCase("t") ||
                    letter.equalsIgnoreCase("u") ||
                    letter.equalsIgnoreCase("v")) {
                System.out.println("The corresponding number is 8");
            }else if (letter.equalsIgnoreCase("w") ||
                    letter.equalsIgnoreCase("x") ||
                    letter.equalsIgnoreCase("y") ||
                    letter.equalsIgnoreCase("z")) {
                System.out.println("The corresponding number is 9");
            }
        }
        else{
            System.out.println(letter + " is an invalid input ");
        }
    }
}
