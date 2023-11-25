package week_07.assigments;

import java.util.Scanner;

public class Question_07_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int number = input.nextInt();
        int[] list1 = new int[number];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int number2 = input.nextInt();
        int[] list2 = new int[number2];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        if ((number == number2) && equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else {
            System.out.println("Two lists are not identical");
        }
    }

    public static boolean equals(int[] list1, int[] list2) {
        if (list1.length != list2.length){
            return false;
        }
        int count1 = 0;
        int count2 = 0;
        boolean isIdentical = true;
        for (int i = 0; i < list1.length; i++) {
            int number = list1[i];
            for (int k = 0; k < list1.length; k++) {
                if (number == list1[k]) {
                    count1++;
                }
            }
            for (int k = 0; k < list2.length; k++) {
                if (number == list2[k]) {
                    count2++;
                }
            }
            if (count1 != count2) {
                isIdentical = false;
            }
        }
        return isIdentical;
    }

}
