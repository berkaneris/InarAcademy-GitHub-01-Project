package week_14.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        System.out.print("Enter the first list: ");
        for(int i = 0; i < 6; i++){
            list1.add(input.nextInt());
        }
        System.out.print("Enter the second list: ");
        for(int i = 0; i < 6; i++){
            list2.add(input.nextInt());
        }

        list1.retainAll(list2);
        System.out.println("Intersection of the two lists: " + list1);
    }
}
