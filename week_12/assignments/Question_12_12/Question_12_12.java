package week_12.assigments.Question_12_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_12 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage: java Question_12_12 filename.java");
            System.exit(1);
        }

        File myfile = new File(args[0]);
        if (!myfile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }
        ArrayList<String> myText = new ArrayList<>();

        // Create input and output files
       try {
           Scanner input = new Scanner(myfile);


           while (input.hasNext()) {
               String s1 = input.nextLine();

               myText.add(s1);
           }
           input.close();

           PrintWriter output = new PrintWriter(myfile);
           for (int i = 0; i < myText.size() - 1; i++) {
             if(myText.get(i + 1).contains("{")) {
                 output.println(myText.get(i) + " " + myText.get(i + 1).trim());
                 i++;
             }else {
                 output.println(myText.get(i));
             }
           }
           output.println(myText.get(myText.size() - 1));
           output.close();
       }catch (Exception ex){
           System.out.println("This is an error");
       }
    }
}
