package week_11.assigments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question_11_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer m: ");
        int m = input.nextInt();
        int n = findSmallestPerfectNumber(m);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n + "\nm * n is " + (m * n));
    }

    public static int findSmallestPerfectNumber(int m) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divider = 2;
        while(m != 1){
            if(m % divider == 0){
                factors.add(divider);
                m /= divider;
            }else{
                divider++;
            }
        }
        int result = 1;
        int i = 0;
        while (i < factors.size()){
            if(Collections.frequency(factors , factors.get(i)) % 2 != 0){
                result *= factors.get(i);
                i+= Collections.frequency(factors , factors.get(i));
            }else {
                i++;
            }
        }
        return result;
    }
}
