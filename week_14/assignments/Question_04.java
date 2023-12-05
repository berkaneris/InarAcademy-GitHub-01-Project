package week_14.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        List<Integer> listC = new ArrayList<>();

        System.out.print("Enter the size 'n' for ArrayList A: ");
        int n = input.nextInt();
        System.out.print("Enter " + n + " Integers for ArrayList A: ");
        for(int i = 0; i < n; i++){
            listA.add(input.nextInt());
        }
        System.out.print("\nEnter the size 'n' for ArrayList B: ");
        n = input.nextInt();
        System.out.print("Enter " + n + " Integers for ArrayList B: ");
        for(int i = 0; i < n; i++){
            listB.add(input.nextInt());
        }

        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);
        merge(listA , listB , listC);
        System.out.println("\nMerged and sorted ArrayList C:\n" + listC);

    }
    public static void merge(List<Integer> listA ,List<Integer> listB , List<Integer> listC ){
         for(int i = 0; i < listA.size() + listB.size(); i++){
             if(i < listA.size()) {
                 listC.add(listA.get(i));
             }else{
                 listC.add(listB.get(i - listA.size()));
             }
         }
    }
}
