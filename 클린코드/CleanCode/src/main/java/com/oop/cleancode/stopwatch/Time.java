package com.oop.cleancode.stopwatch;

public class Time {
    private long nano;

    public Time(long time) {
        this.nano = time;
    }

    public long getMilliTime() {
        return (long) (nano / Math.pow(10, 6));
    }

    public long getNanoTime() {
        return nano;
    }
}
