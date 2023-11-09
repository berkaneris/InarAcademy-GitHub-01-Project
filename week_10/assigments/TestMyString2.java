package week_10.assigments;

public class TestMyString2 {
    public static void main(String[] args) {

        MyString2 myString2 = new MyString2("ELON MUSK");
        System.out.println(myString2);
        MyString2 myString1 = new MyString2("D");
        System.out.println(myString1);
        System.out.println(myString1.getStr().length());
        System.out.println(MyString2.valueOf(2>1));
        System.out.println(MyString2.valueOf(false));

        


    }
}
