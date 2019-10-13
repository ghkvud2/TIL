package com.oop.cleancode.stopwatch;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class StopWatchTest {

    private long expectedElapsedTime = 100l;

    @Test
    public void should_return_milli_seconds() {
        ProceduralStopWatch proceduralStopWatch = new ProceduralStopWatch();
        proceduralStopWatch.startTime = System.currentTimeMillis();
        doSomething();
        proceduralStopWatch.endTime = System.currentTimeMillis();
        long elapsedTime = proceduralStopWatch.getElapsedTime();
        assertThat(elapsedTime, CoreMatchers.is(Matchers.greaterThanOrEqualTo(expectedElapsedTime)));
    }

    @Test
    public void should_return_nano_seconds() {
        ProceduralStopWatch proceduralStopWatch = new ProceduralStopWatch();
        proceduralStopWatch.startNanoTime = System.nanoTime();
        doSomething();
        proceduralStopWatch.endNanoTime = System.nanoTime();
        long elapsedTime = proceduralStopWatch.getNanoElapsedTime();
        assertThat(elapsedTime, CoreMatchers.is(Matchers.greaterThanOrEqualTo(expectedElapsedTime * (long) Math.pow(10, 6))));
    }

    @Test
    public void stopwatch_should_return_milli_seconds() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        doSomething();
        stopWatch.end();
        Time time = stopWatch.getElapsedTime();
        assertThat(time.getMilliTime(), CoreMatchers.is(Matchers.greaterThanOrEqualTo(expectedElapsedTime)));
    }

    @Test
    public void stopwatch_should_return_nano_seconds() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        doSomething();
        stopWatch.end();
        Time time = stopWatch.getElapsedTime();
        assertThat(time.getNanoTime(), CoreMatchers.is(Matchers.greaterThanOrEqualTo(expectedElapsedTime)));
    }


    private void doSomething() {
        try {
            Thread.sleep(expectedElapsedTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}