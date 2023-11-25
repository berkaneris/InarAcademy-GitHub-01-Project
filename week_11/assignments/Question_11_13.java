package week_11.assigments;

import java.util.ArrayList;
import java.util.Scanner;

public class Question_11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        int number;
        for (int i = 0; i < 10; i++) {
            number = input.nextInt();
            list.add(number);
        }
        removeDuplicate(list);
        printList(list);
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        int i = 0;
        while ( i < list.size()) {
            boolean isRemoved = false;
            for (int k = i + 1; k < list.size(); k++) {
                if ((list.get(i).equals(list.get(k)))) {
                    list.remove(k);
                    isRemoved = true;
                }
            }
            if(!isRemoved){
                i++;
            }
        }
    }

    public static void printList(ArrayList<Integer> list) {
        System.out.print("The distinct integers are ");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }
}
