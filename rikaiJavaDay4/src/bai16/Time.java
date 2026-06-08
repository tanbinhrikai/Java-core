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
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Hour must be 0-23");
        }
    }

    private void validateMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Minute must be 0-59");
        }
    }

    private void validateSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Second must be 0-59");
        }
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }


    public void addSeconds(int secondsToAdd) {
        int total = hour * 3600 + minute * 60 + second + secondsToAdd;

        total = (total % 86400 + 86400) % 86400; // safe wrap

        hour = total / 3600;
        minute = (total % 3600) / 60;
        second = total % 60;
    }

    public void addMinutes(int minutesToAdd) {
        addSeconds(minutesToAdd * 60);
    }

    public void addHours(int hoursToAdd) {
        addSeconds(hoursToAdd * 3600);
    }


    public boolean isAfter(Time other) {
        return toSeconds() > other.toSeconds();
    }

    public boolean isBefore(Time other) {
        return toSeconds() < other.toSeconds();
    }

    private int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }
}