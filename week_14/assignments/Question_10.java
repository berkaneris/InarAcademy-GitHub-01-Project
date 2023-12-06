package week_14.assignments;

import java.util.*;

public class Question_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Post Fix Expression = ");
        try {
            String expression = input.nextLine();
            System.out.println("Output: " + getLastResult(expression, input));
            // TODO create explanation
        }catch (RuntimeException ex){
            System.out.println("This is not a true postfix expression");
        }
    }
    public static double calculate(double num1, double num2, String str){
        switch (str){
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "/": return num1 / num2;
            case "*": return num1 * num2;
            default:
                throw new IllegalArgumentException("This " + str + " is not valid.");
        }

    }
    public static double getLastResult(String expression , Scanner input){
        input = new Scanner(expression);
        Stack<Double> operators = new Stack<>();
        List<String> operands = new ArrayList<>(Arrays.asList("+", "-", "/", "*"));
        while(input.hasNext()){
            String str = input.next();
            if(!operands.contains(str)){
                operators.push(Double.parseDouble(str));
            }else{
                if(operators.size() > 1) {
                    double num2 = operators.pop();
                    double num1 = operators.pop();
                    double result = calculate(num1 , num2 , str);
                    operators.push(result);
                }
            }
        }
        return operators.pop();
    }
}
