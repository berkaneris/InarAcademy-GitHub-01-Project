package week_12.assigments.Question_12_15;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_12_15 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\asus\\workspace\\inar-java\\src\\week_12\\assigments\\Question_12_15\\Question_12_15.txt");
        if (file.exists()) {
            System.out.println("There is a file with the same name.");
            System.exit(1);
        }
        try {

            PrintWriter writer = new PrintWriter(file);
            for (int i = 1; i <= 100; i++) {
                int num = (int) (Math.random() * 100);
                if (i % 10 == 0) {
                    writer.println(num);
                } else {
                    writer.print(num + " ");
                }
            }
            writer.close();

            Scanner reader = new Scanner(file);
            ArrayList<Integer> list = new ArrayList<>();

            while (reader.hasNext()) {
                list.add(reader.nextInt());
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if((i+1) % 10 == 0) {
                    System.out.printf("%3d\n" , list.get(i));
                }else{
                    System.out.printf("%3d" , list.get(i));
                }
            }
            reader.close();

        } catch (IOException ex) {
            System.out.println("There is an error.");
        }

    }
}
