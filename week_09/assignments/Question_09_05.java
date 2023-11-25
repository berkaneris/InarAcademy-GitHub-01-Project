package week_09.assigments;


import java.util.GregorianCalendar;

public class Question_09_05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();


        System.out.println("Current year: " + calendar.get(GregorianCalendar.YEAR) + "\nCurrent month: " + calendar.get(GregorianCalendar.MONTH) + "\nCurrent day: " +
                calendar.get(GregorianCalendar.DAY_OF_MONTH ) + "\n");

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("After setTime:" + "\nCurrent year: " + calendar.get(GregorianCalendar.YEAR) + "\nCurrent month: " + calendar.get(GregorianCalendar.MONTH) + "\nCurrent day: " +
                calendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
