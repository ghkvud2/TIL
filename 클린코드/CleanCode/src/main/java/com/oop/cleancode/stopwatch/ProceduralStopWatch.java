package com.oop.cleancode.stopwatch;

public class ProceduralStopWatch {
    public long startTime;
    public long endTime;
    public long startNanoTime;
    public long endNanoTime;

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public long getNanoElapsedTime() {
        return endNanoTime - startNanoTime;
    }
}
