package week_10.assigments;

import week_10.StackOfIntegers;

public class DisplayPrimeNumbers {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int number = 2; number < 120; number++) {
            boolean isPrime = true;
            for (int divider = 2; divider <= number / 2; divider++) {
                 if(number % divider == 0){
                     isPrime = false;
                     break;
                 }
            }
            if(isPrime){
                stack.push(number);
            }
        }
        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
