package com.part16;

public class Time {

    private static final int HOURS_PER_DAY = 24;
    private static final int MINUTES_PER_HOUR = 60;

    //public immutable fields.
    public final int hour;
    public final int minute;


    // Enforcing invarants through constructor.
    public Time(int hour, int minute) {
        if (hour < 0 || hour >= HOURS_PER_DAY)
            throw new IllegalArgumentException("Hour : " + hour);
        if (minute < 0 || minute > MINUTES_PER_HOUR)
            throw new IllegalArgumentException("Minute : " + minute);
        this.hour = hour;
        this.minute = minute;


    }



}
