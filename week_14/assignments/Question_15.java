package week_14.assignments;

import java.util.*;

public class Question_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int size = input.nextInt();

        List<Integer> arraylist = new ArrayList<>();
        System.out.println("Enter the elements of the ArrayList (each in the range [1, n]): ");
        for(int i = 0; i < size; i++){
            arraylist.add(input.nextInt());
        }
        System.out.println("Numbers missing from the ArrayList: " + findMissingNumbers(arraylist));
    }
    public static List<Integer> findMissingNumbers(List<Integer> arraylist){
        List<Integer> missingNumbers = new ArrayList<>();
        Map<Integer , Integer> list = new HashMap<>();

        for(int i = 0; i < arraylist.size(); i++){
            if(!list.containsKey(arraylist.get(i))){
                list.put(arraylist.get(i) , 1);
            }
        }
        for(int i = 1; i <= arraylist.size(); i++){
            if(!list.containsKey(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}
