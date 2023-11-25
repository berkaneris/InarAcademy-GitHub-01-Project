package week_10.assigments;

public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger myInteger1 = new MyInteger(41614161);
        System.out.println("getValue(): " + myInteger1.getValue());
        System.out.println("isEven(): " + myInteger1.isEven());
        System.out.println("isOdd(): " + myInteger1.isOdd());
        System.out.println("isPrime(): " + myInteger1.isPrime());
        System.out.println("equals(10): " + myInteger1.equals(10));
        System.out.println("equals(MyInteger(41614161)): " + myInteger1.equals(new MyInteger(41614161)));
        System.out.println("isEven(41614161) static: " + MyInteger.isEven(41614161));
        System.out.println("isOdd(41614161) static: " + MyInteger.isOdd(41614161));
        System.out.println("isPrime(41614161) static: " + MyInteger.isPrime(41614161));
        System.out.println("parseInt(char[]{1, 2, 3}) static: " + MyInteger.parseInt(new char[]{'1', '2', '3'}));
        System.out.println("parseInt(String 123) static: " + MyInteger.parseInt("123"));


    }
}
