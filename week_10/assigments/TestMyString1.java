package week_10.assigments;

public class TestMyString1 {
    public static void main(String[] args) {
        char [] name = {'I' , 'N' , 'A' , 'R' };
        MyString1 myString1 = new MyString1(name);

        System.out.println(myString1);
        System.out.println(myString1.toLowerCase());
        System.out.println(myString1.substring(0, 2));
        MyString1 myString2 = myString1.substring(0, 2);
        System.out.println(myString2.length());
        System.out.println(myString1.equals(myString2));
        System.out.println(myString1.equals(myString1));
        System.out.println(MyString1.valueOf(65913));
    }
}
