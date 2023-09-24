package week_06.assigments;

public class Question_06_24_01 {
    public static void main(String[] args) {
        long totalMilliSecond = System.currentTimeMillis();
        int currentSecond = getCurrentSecond(totalMilliSecond);
        int currentMinute = getCurrentMinute(totalMilliSecond);
        int currentHour = getCurrentHour(totalMilliSecond);
        int currentYear = getCurrentYear(totalMilliSecond);
        int currentMonth = getCurrentMonth(totalMilliSecond , currentYear);
        int currentDay = getCurrentDay(totalMilliSecond , currentYear);

        System.out.println("Current time and date is : " + (currentHour % 12) + ":" + currentMinute + ":" +
                currentSecond + " " + ((currentHour > 12) ? "PM" : "AM") + "   " + currentMonth + " / " +
                currentDay + " / " + currentYear);


    }

    public static int getCurrentSecond(long totalMilliSecond){
        return (int)(totalMilliSecond / 1000 % 60);
    }
    public static int getCurrentMinute(long totalMilliSecond){
        return (int)(totalMilliSecond / 1000 / 60 % 60);
    }
    public static int getCurrentHour(long totalMilliSecond){
        return (int)(totalMilliSecond / 1000 / 60 / 60 + 3) % 24;
    }
    public static int getCurrentYear(long totalMilliSecond){
        int totalDays = getTotalDays(totalMilliSecond);
        int year = 1970;
        while (totalDays > daysInYear(year)){
        totalDays -= daysInYear(year);
        year++;
        }
        return year;
    }
    public static int getTotalDays(long totalMilliSecond){
        return (int)(totalMilliSecond / 1000 / 60 / 60 / 24);
    }
    public static int daysInYear(int year){
        return isLeapYear(year) ? 366 : 365;
    }
    public static boolean isLeapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }
    public static int getCurrentMonth(long totalMilliSecond , int currentYear){

        int numberOfDaysInCurrentYear = getTotalDaysInCurrentYear(totalMilliSecond , currentYear);
        int month = 1;
        while (numberOfDaysInCurrentYear > getNumberOfDaysInMonth(month , currentYear)){
            numberOfDaysInCurrentYear -= getNumberOfDaysInMonth(month , currentYear);
            month++;
        }
        return month;
    }
    public static int getNumberOfDaysInMonth(int month , int currentYear){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }else if (month == 2){
            return isLeapYear(currentYear) ? 29 : 28;
        }else{
            return 30;
        }
    }
    public static int getCurrentDay(long totalMilliSecond , int currentYear){

        int numberOfDaysInCurrentYear = getTotalDaysInCurrentYear(totalMilliSecond ,currentYear);
        int month = 1;
        while (numberOfDaysInCurrentYear > getNumberOfDaysInMonth(month , currentYear)){
            numberOfDaysInCurrentYear -= getNumberOfDaysInMonth(month , currentYear);
            month++;
        }
        return numberOfDaysInCurrentYear % 31 + 1;

    }
    public static int getTotalDaysInCurrentYear(long totalMilliSecond , int currentYear){
        int sum = 0;
        for(int i = 1970; i < currentYear; i++){
            sum += isLeapYear(i) ? 366 : 365;
        }
        return  getTotalDays(totalMilliSecond) - sum;
    }
}
