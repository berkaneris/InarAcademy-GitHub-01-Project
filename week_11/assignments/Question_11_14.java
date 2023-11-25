package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_14 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.print("Enter five integers for list1: ");
        getFiveNumber(list1);
        System.out.print("Enter five integers for list2: ");
        getFiveNumber(list2);
        ArrayList<Integer> combinedList = union(list1 , list2);
        printList(combinedList);

    }
    public static ArrayList<Integer> union(
            ArrayList<Integer> list1, ArrayList<Integer> list2){
       list1.addAll(list2);
       return list1;
    }
    public static void getFiveNumber(ArrayList<Integer> list){
        Scanner input = new Scanner(System.in);
        int number;
        for(int i = 0; i < 5; i++){
            number = input.nextInt();
            list.add(number);
        }
    }
    public static void printList(ArrayList<Integer> list){
        System.out.print("The combined list is ");
        for (Integer element: list) {
            System.out.print(element + " ");
        }
    }
}
