package bai16;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private void validateHour(int hour) {
        if(hour<0 || hour>23) {
            throw new IllegalArgumentException("Hour phải từ 0 đến 23");
        }
    };
    private void validateMinute(int minute) {
        if(minute<0 || minute>59) {
            throw  new IllegalArgumentException("minute must 0-59");
        }
    }
    private void validateSecond(int second) {
        if(second<0 || second>59) {
            throw  new IllegalArgumentException("second must 0-59");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public void addSeconds(int second){
        int hour = second/3600;
        int minute = second%3600/60;
        int seconds = second%60;
        this.hour = (this.hour+hour)%24;
        this.minute = (this.minute+minute)%60;
        this.second = (this.second+seconds)%60;
    }


    public void addMinutes (int minuteAdd){
        int totalMinutes = this.hour*60+this.minute + minuteAdd;
        totalMinutes = totalMinutes % (24*60);
         this.hour = totalMinutes/60;
        this.minute = totalMinutes%60;


    }

    public void addHours (int hourAdd){
        this.hour  = (this.hour + hourAdd)%24;
    }

    public boolean isAfter(Time time){
        int  totalSeconds  = this.second + this.minute*60+ this.hour*3600;
        int totalSecondsTime  = time.hour*3600 + time.minute*60 + time.second;
        return totalSecondsTime >= totalSecondsTime;
    }

    public boolean isBefore (Time time){
        int  totalSeconds  = this.second + this.minute*60+ this.hour*3600;
        int totalSecondsTime  = time.hour*3600 + time.minute*60 + time.second;
        return totalSecondsTime <= totalSecondsTime;
    }
}
