package week_12.assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question_12_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        String year = input.next();
        System.out.print("Enter the gender: ");
        String gender = input.next();
        input.nextLine();
        System.out.print("Enter the name: ");
        String name = input.nextLine();

        File file = new File("babynameranking" + year + ".txt");

        try{
            ArrayList<String> males = new ArrayList<>();
            ArrayList<String> females = new ArrayList<>();
             input = new Scanner(file);

             while(input.hasNext()){
                 input.next();
                 males.add(input.next());
                 input.next();
                 females.add(input.next());
                 input.next();
             }
             input.close();
             // Find the rank for the name
             int rank;
             if(gender.equalsIgnoreCase("M")){
                 rank = searchForName(males, name);
             }else{
                 rank = searchForName(females, "F");
             }

             // Display the result
             if(rank != -1){
                 System.out.println(name + " is ranked #" + rank + " in year " + year);
             }else{
                 System.out.println("The name " + name + " is not ranked in year " + year);
             }



        }catch (IOException ex){
            System.out.println("This is an error.");
        }


    }
    public static int searchForName(ArrayList<String> list, String name){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equalsIgnoreCase(name)){
                return i + 1;
            }
        }
        return -1;
    }
}
