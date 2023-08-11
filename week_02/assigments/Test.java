package week_02.assigments;

public class Test {
    public static void main(String[] args) {
        double deger=(long)((365 * 24 * 60 * 60 / 7.0) - (365 * 24 * 60 * 60 / 13.0) +
                (365 * 24 * 60 * 60 / 45.0)) + 312032486;
        System.out.println(deger);
    }
}
