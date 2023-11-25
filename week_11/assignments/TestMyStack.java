package week_11.assigments;

import java.util.Collections;
import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack myStack = new MyStack();
        System.out.print("Enter five Strings: ");
        for(int i = 0; i < 5; i++){
            myStack.push(input.next());
        }
        System.out.println("Stack: " + myStack);

        System.out.println("Displaying them in reverse order..");
       while(!myStack.isEmpty()){
            System.out.print(myStack.pop() + " ");
        }

    }
}
