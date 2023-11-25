package week_10.assigments;

public class TestMyStringBuilder2 {
    public static void main(String[] args) {
        MyStringBuilder2 s1 = new MyStringBuilder2("1907");
        MyStringBuilder2 s2 = new MyStringBuilder2("Fenerbahce");
        System.out.println("Insert s2 into s1 at index 2 ---------> " + s1.insert(2,s2));
        System.out.println("Reverse s2 ---------------------------> " + s2.reverse());
        MyStringBuilder2 s3 = s1.insert(2,s2).substring(7);
        System.out.println("Substring of s3 beginning index 10 ---> " + s3);
        System.out.println("S2 to upper case ---------------------> " + s2.toUpperCase());

    }
}
