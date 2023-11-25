package week_04.assigments;

import java.util.Scanner;

public class Question_04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        /*  The first character indicates the major (M: Mathematics, C: Computer Science, I: Information Technology )and
        the second is number character 1, 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior, or senior. */
        String section = input.nextLine();

        char ch1 = section.charAt(0);
        char ch2 = section.charAt(1);

        if (ch1 == 'M'){
            System.out.print("Mathematics ");
            if (ch2 == '1'){
                System.out.println("Freshman");
            } else if (ch2 == '2') {
                System.out.println("Sophomore");
            }else if (ch2 == '3') {
                System.out.println("Junior");
            }else if (ch2 == '4') {
                System.out.println("Senior");
            }
        } else if (ch1 == 'C') {
            System.out.print("Computer Science ");
            if (ch2 == '1'){
                System.out.println("Freshman");
            } else if (ch2 == '2') {
                System.out.println("Sophomore");
            }else if (ch2 == '3') {
                System.out.println("Junior");
            }else if (ch2 == '4') {
                System.out.println("Senior");
            }
        }else if (ch1 == 'I') {
            System.out.print("Information Technology ");
            if (ch2 == '1'){
                System.out.println("Freshman");
            } else if (ch2 == '2') {
                System.out.println("Sophomore");
            }else if (ch2 == '3') {
                System.out.println("Junior");
            }else if (ch2 == '4') {
                System.out.println("Senior");
            }
        }else {
            System.out.println("The input is invalid.");
        }

    }
}
