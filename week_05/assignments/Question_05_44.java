package week_05.assigments;

import java.util.Scanner;

public class Question_05_44 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        short input = scanner.nextShort();

        // Close the scanner to prevent resource leak
        scanner.close();
// Display the 16 bits for the integer
        System.out.print("The bits are ");
        for (int i = 15; i >= 0; i--) {
            // Use bitwise AND to extract the bit at position i
            int bit = (input >> i) & 1;
            System.out.print(bit);
        }

        System.out.println(); // Print a newline
    }


}

