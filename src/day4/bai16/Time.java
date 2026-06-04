package day4.bai16;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSecond(second);
    }

    public void addSeconds(int extra) {
        int x = toSeconds() + extra;

        if(x < 0){
            while(x < 0) {
                x = x + 86400;
            }
        }

        int newX = x % 86400;
       setHour((newX / 3600));
        setMinute((newX % 3600) / 60);
       setSecond((newX % 3600) % 60);

        System.out.println("New time: " + toString());
    }

    public void addMinutes(int m) {
        addSeconds(m * 60);
    }

    public void addHours(int h) {
        addSeconds(h * 3600);
    }


    public boolean isAfter(Time other) {
        return this.toSeconds() > other.toSeconds();
    }

    public boolean isBefore(Time other) {
        return toSeconds() < other.toSeconds();
    }

    public int toSeconds() {
        return hour * 3600 + minute * 60 + second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public void setHour(int hour) {
        if(hour == 24)
            setHour(0);
        else if(hour < 0 || hour > 23)
            System.out.println("hour (0-23)");
        else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute > 59) {
            System.out.println("minute (0-59)");
        }
        else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59) {
            System.out.println("Second (0-59)");
        }
        else {
            this.second = second;
        }
    }
}
