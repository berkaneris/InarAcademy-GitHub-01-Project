package week_12.assigments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_11 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println(
                    "Usage: java Question_12_11 John filename");
            System.exit(1);
        }
        File myfile = new File(args[1]);
        if (!myfile.exists()) {
            System.out.println(args[1] + " does not exist");
            System.exit(2);
        }
        ArrayList<String> myText = new ArrayList<>();

        // Create input and output files
       try {
           Scanner input = new Scanner(myfile);

           while (input.hasNext()) {
               String s1 = input.nextLine();
               String s2 = s1.replaceAll(args[0], "");
               myText.add(s2);
           }
           input.close();

           PrintWriter output = new PrintWriter(myfile);
           for (int i = 0; i < myText.size(); i++) {

               output.println(myText.get(i));

           }
           output.close();
       }catch (IOException ex){
           System.out.println(ex.getMessage());
       }

    }
}
