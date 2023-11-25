package week_10.assigments;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        long totalSecond = elapsedTime / 1000;
        second = (int) (totalSecond % 60);
        long totalMinute = totalSecond / 60;
        minute = (int) (totalMinute % 60);
        long totalHour = totalMinute / 60;
        hour = (int) (totalHour % 24);

    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public void setTime(long elapsedTime){
        long totalSecond = elapsedTime / 1000;
        second = (int) (totalSecond % 60);
        long totalMinute = totalSecond / 60;
        minute = (int) (totalMinute % 60);
        long totalHour = totalMinute / 60;
        hour = (int) (totalHour % 24);
    }
}
