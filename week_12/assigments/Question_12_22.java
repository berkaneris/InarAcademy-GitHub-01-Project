package week_12.assigments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_22 {
    public static void main(String[] args)  {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Question_12_22 dir oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Directory " + args[0] + " does not exist");
            System.exit(2);
        }
        File[] files = new File[0];
        if(file.isDirectory()){
            files = file.listFiles();
        }else{
            System.out.println("This is not a directory");
            System.exit(1);
        }
       if(files != null) {
           for (int i = 0; i < files.length; i++) {
               if (files[i].isFile()) {
                   try {
                       ArrayList<String> text = new ArrayList<>();
                       // Create input and output files
                       Scanner input = new Scanner(files[i]);


                       while (input.hasNext()) {
                           String s1 = input.nextLine();
                           String s2 = s1.replaceAll(args[1], args[2]);
                           text.add(s2);
                       }
                       input.close();
                       PrintWriter output = new PrintWriter(files[i]);

                       for (int k = 0; k < text.size(); k++) {
                           output.println(text.get(k));
                       }
                       output.close();

                   } catch (IOException ex) {
                       System.out.println(ex.getMessage());
                   }
               }
           }
       }

    }
}

