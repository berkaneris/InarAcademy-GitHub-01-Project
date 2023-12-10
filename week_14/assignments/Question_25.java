package week_14.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_25 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 15; i++){
            numbers.add((int)(Math.random() * 100 + 1));
        }

        System.out.println("Generated ArrayList:\n" + numbers);
        int targetSum = (int)(Math.random() * 100 + 1);
        System.out.println("Generated Target Sum: " + targetSum);
        List<Integer> result = findNumbers(numbers , targetSum);
        if(result.size() == 2){
            System.out.println("Numbers are: " + result.get(0)  + ", " + result.get(1));
            System.out.println("Result: true");
        }else{
            System.out.println("Result: false");
        }
    }
    public static List<Integer> findNumbers(List<Integer> numbers , int targetSum){
        Set<Integer> nums = new HashSet<>(numbers);
        numbers = new ArrayList<>(nums);
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < numbers.size() - 1; i++){
            for(int k = i + 1; k < numbers.size(); k++){
                if(numbers.get(i) + numbers.get(k) == targetSum){
                    result.add(numbers.get(i));
                    result.add(numbers.get(k));
                }
            }
        }
        return result;
    }
}
