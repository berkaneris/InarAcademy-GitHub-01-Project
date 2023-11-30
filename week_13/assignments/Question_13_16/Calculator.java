package week_13.assignments.Question_13_16;

import week_13.Rational;

public class Calculator {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 1) {
            System.out.println(
                    "Usage: java Calculator \"operand1 operator operand2\"");
            System.exit(0);
        }

        String[] operators = args[0].split(" ");
        if(operators.length != 3){
            System.out.println("Usage: java Calculator \"operand1 operator operand2\"");
            System.exit(1);
        }

        String[] numbers = operators[0].split("/");
        Rational rational1 = new Rational(Long.parseLong(numbers[0]) , Long.parseLong(numbers[1]));

        numbers = operators[2].split("/");
        Rational rational2 = new Rational(Long.parseLong(numbers[0]) , Long.parseLong(numbers[1]));



        // The result of the operation
        Rational result = new Rational();

        // Determine the operator
        switch (operators[1].charAt(0)) {
            case '+': result = rational1.add(rational2);
                break;
            case '-': result = rational1.subtract(rational2);
                break;
            case '.': result = rational1.multiply(rational2);
                break;
            case '/': result = rational1.divide(rational2);
        }

        // Display result
        System.out.println(operators[0] + ' ' + operators[1] + ' ' + operators[2]
                + " = " + (result.getNumerator() + "/" + result.getDenominator()));
    }

}
