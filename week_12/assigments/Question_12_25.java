package week_12.assigments;

import java.io.File;
import java.util.Scanner;

public class Question_12_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a directory name: ");
        String name = input.nextLine();
        File file = new File(name);
        if(file.mkdirs()){
            System.out.println("Directory created successfully");
        }else{
            System.out.println("Directory already exists");
        }
    }
}
