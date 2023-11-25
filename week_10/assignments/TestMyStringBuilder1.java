package week_10.assigments;

public class TestMyStringBuilder1 {
    public static void main(String[] args) {
        MyStringBuilder1 myStringBuilder1 = new MyStringBuilder1("La Casa De Papel--");
        System.out.println(myStringBuilder1);
        MyStringBuilder1 myStringBuilder2 = new MyStringBuilder1("@El Profesor");
         myStringBuilder1 = myStringBuilder1.append(myStringBuilder2);
        System.out.println(myStringBuilder1);
        myStringBuilder1 = myStringBuilder1.append(4161);
        System.out.println(myStringBuilder1);
        System.out.println(myStringBuilder1.length());
        System.out.println(myStringBuilder1.charAt(11));
        System.out.println(myStringBuilder1.toLowerCase());
        System.out.println(myStringBuilder1.substring(19,29).toLowerCase());
    }
}
