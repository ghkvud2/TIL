package com.oop.cleancode.stopwatch;

public class StopWatch {
    public long startTime;
    public long endTime;

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public Time getElapsedTime() {
        return new Time(endTime - startTime);
    }

}
