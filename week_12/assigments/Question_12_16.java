package week_12.assigments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_16 {
    public static void main(String[] args)  {
        // Check command line parameter usage
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Question_12_16 file oldStr newStr");
            System.exit(1);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }



        try {
            ArrayList<String> text = new ArrayList<>();
            // Create input and output files
            Scanner input = new Scanner(sourceFile);


            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[1], args[2]);
                text.add(s2);
            }
            input.close();

            PrintWriter output = new PrintWriter(sourceFile);
            for(int i = 0; i < text.size(); i++){
                output.println(text.get(i));
            }
            output.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}

