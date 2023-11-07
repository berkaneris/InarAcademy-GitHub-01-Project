package week_10.assigments;


import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;
    GregorianCalendar calendar = new GregorianCalendar();

    public MyDate(){
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public MyDate(long elapsedTime){
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
    public MyDate(int year , int month , int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setDate(long elapsedTime){
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }


}
