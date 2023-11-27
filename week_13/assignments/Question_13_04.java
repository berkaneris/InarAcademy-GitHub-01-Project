package week_13.assignments;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Question_13_04 {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("Usage java Question_13_04 monthNum yearNum");
            System.exit(1);
        }
        // Prompt the user to enter year
        int year = Integer.parseInt(args[1]);

        // Prompt the user to enter month
        int month = Integer.parseInt(args[0]);

        // Print calendar for the month of the year
        printMonth(year, month);

    }
    public static void printMonth(int year, int month) {
        // Print the headings of the calendar
        printMonthTitle(year, month);

        // Print the body of the calendar
        printMonthBody(year, month);
    }
    public static void printMonthTitle(int year, int month) {
        System.out.println("         " + getMonthName(month)
                + ", " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        return monthName;
    }
    /** Print month body */
    public static void printMonthBody(int year, int month) {
        Calendar calendar = new GregorianCalendar(year , month - 1 , 1);
        // Get start day of the week for the first date in the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        // Get number of days in the month
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Pad space before the first day of the month
        int i ;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

}

