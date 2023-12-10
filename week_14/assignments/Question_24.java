package week_14.assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question_24 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            nums.add((int)(Math.random() * 20 + 1));
        }
        int k = (int)(Math.random() * 10 + 1);

        System.out.println("Array: " + nums);
        System.out.println("Is there a nearby duplicate with absolute difference at most " + k + "? " + isDuplicate(nums , k));
    }
    public static boolean isDuplicate(List<Integer> nums , int k){
        Set<Integer> numbers = new HashSet<>(nums);
        if(numbers.size() == nums.size()){
            return false;
        }
        for(int i = 0; i < nums.size() - 1; i++){
            for (int l = i + 1; l < nums.size(); l++){
                if(nums.get(i) == nums.get(l) && Math.abs(i - k) <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
