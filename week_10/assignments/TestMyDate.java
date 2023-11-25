package week_10.assigments;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(561555550000L);

        System.out.println("Date1: " + myDate1.getDay() + "/" + (myDate1.getMonth() + 1) + "/" + myDate1.getYear());
        System.out.println("Date2: " + myDate2.getDay() + "/" + myDate2.getMonth() + "/" + myDate2.getYear());

    }
}
