package week_12.assigments;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_13 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Question_12_13 filename.java ");
            System.exit(1);
        }

        File myfile = new File(args[0]);
        if (!myfile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        // Create two arraylist for lines and words
        ArrayList<String> readLines = new ArrayList<>();
        ArrayList<String> readWords = new ArrayList<>();
        try {
            Scanner input = new Scanner(myfile);


            while (input.hasNext()) {
                String s1 = input.nextLine();
                readLines.add(s1);

            }

           input.close();
            Scanner input1 = new Scanner(myfile);
            while (input1.hasNext()) {
                String s1 = input1.next();
                readWords.add(s1);

            }
            input.close();

            int totalChar = 0;
            for(int i = 0; i <readLines.size(); i++){
               totalChar += readLines.get(i).length();
            }
            System.out.println("File " + args[0] + " has");
            System.out.println(totalChar + " characters");
            System.out.println(readWords.size() + " words");
            System.out.println(readLines.size() + " lines");

        } catch (Exception ex) {
            System.out.println("This is an error");
        }
    }
}

