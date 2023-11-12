package week_11.assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sequence of numbers ending with 0: ");
        ArrayList<Integer> list = new ArrayList<>();
        int number = input.nextInt();
        while(number != 0){
            list.add(number);
            number = input.nextInt();
        }

        System.out.println("The largest number in the list is " + max(list));


    }
    public static Integer max(ArrayList<Integer> list){
        if(list.isEmpty()){
            return null;
        }
        return Collections.max(list);

    }

}
