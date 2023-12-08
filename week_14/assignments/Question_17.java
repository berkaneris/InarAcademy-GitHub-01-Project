package week_14.assignments;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Question_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (enter 0 to stop): ");
        int number = input.nextInt();
        Map<Integer , Integer> numbers = new TreeMap<>();
        while(number != 0){
            if (!numbers.containsKey(number)) {
                numbers.put(number, 1);
            } else {
                int value = numbers.get(number);
                value++;
                numbers.put(number, value);
            }
            number = input.nextInt();
        }
        int maxOccurrence = 0;
        Set<Map.Entry<Integer, Integer>> entry = numbers.entrySet();
        for (Map.Entry<Integer, Integer> num : entry){
            int value = num.getValue();
            if(value > maxOccurrence){
                maxOccurrence = value;
            }
        }
        for (Map.Entry<Integer, Integer> num : entry){
            if(maxOccurrence == num.getValue()){
                System.out.println(num.getKey() + " --> " + maxOccurrence + " times");
            }
        }

    }
}
