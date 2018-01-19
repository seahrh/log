package com.sgcharts.time;

import java.time.Duration;

/**
 * Accurate measure of time elapsed, usually used to profile code execution.
 * Based on <a href="https://stackoverflow.com/a/1770038/519951">https://stackoverflow.com/a/1770038/519951</a>
 */
public class Timer {
    private long start;

    public static Timer start() {
        return new Timer();
    }

    private Timer() {
        start = System.nanoTime();
    }

    public Duration time() {
        long end = System.nanoTime();
        return Duration.ofNanos(end - start);
    }
}
