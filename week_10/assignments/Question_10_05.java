package week_10.assigments;

import week_10.StackOfIntegers;

import java.util.Scanner;

public class Question_10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int divider = 2;
        StackOfIntegers stack = new StackOfIntegers();
        while (number != 1){
            if(number % divider == 0){
                number /= divider;
                stack.push(divider);
            }else{
                divider++;
            }
        }
        System.out.print("Decreasing order: ");
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        
    }
}
