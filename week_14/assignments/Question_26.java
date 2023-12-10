package week_14.assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Question_26 {
    public static void main(String[] args) {
        List<Integer> singleLinkedList = new LinkedList<>();
        for(int i = 0; i < 5; i++){
            singleLinkedList.add((int)(Math.random() * 100 + 1));
        }
        System.out.println("Original Linked List:" );
        printList(singleLinkedList);
        updateList(singleLinkedList);
        System.out.println("\nUpdated Linked List:");
        printList(singleLinkedList);
    }
    public static void printList(List<Integer> singleLinkedList){
        for (int i = 0; i < singleLinkedList.size(); i++) {
            if(i != singleLinkedList.size() - 1) {
                System.out.print(singleLinkedList.get(i) + " - ");
            }else{
                System.out.print(singleLinkedList.get(i));
            }
        }
    }
    public static void updateList(List<Integer> singleLinkedList){
        List<Integer> arrayList = new ArrayList<>(singleLinkedList);
        singleLinkedList.clear();

        for(int i = 0; i < arrayList.size() - 1; i++){
             int gcd = findGcd(arrayList.get(i) , arrayList.get(i + 1));
             singleLinkedList.add(arrayList.get(i));
             singleLinkedList.add(gcd);
        }
        singleLinkedList.add(arrayList.get(arrayList.size() - 1));
    }
    public static int findGcd(int num1 , int num2){
        if (num1 % num2 == 0)
            return num2;
        else
            return findGcd(num2, num1 % num2);
    }
}
