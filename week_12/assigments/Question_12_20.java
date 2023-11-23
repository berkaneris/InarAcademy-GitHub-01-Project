package week_12.assigments;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_20 {
    public static void main(String[] args) {
        if(args.length != 1){
            System.out.println("Usage java Question_12_18 DirectoryName");
            System.exit(1);
        }
        File file = new File(args[0]);
        File[] files1 = new File[0];
        if(file.isDirectory()){
            files1 = file.listFiles();
        }
        File[] files2 = new File[0];
        for(int i = 0; i < files1.length; i++){
            if(files1[i].getName().contains("chapter" + (i + 1))){
                files2 = files1[i].listFiles();
            }
            for(int k = 0; k < files2.length; k++){
                if(files2[k].getName().contains(".java")){
                    try {
                        ArrayList<String> list = new ArrayList<>();
                        Scanner input = new Scanner(files2[k]);
                        while (input.hasNext()){
                            list.add(input.nextLine());
                        }
                        list.remove(0);
                        input.close();

                        PrintWriter output = new PrintWriter(files2[k]);
                        for(int l = 0; l < list.size(); l++){
                            output.println(list.get(l));
                        }
                        output.close();
                    }catch (IOException ex){
                        System.out.println("This is an exception");
                    }
                }
            }
        }


    }

}

