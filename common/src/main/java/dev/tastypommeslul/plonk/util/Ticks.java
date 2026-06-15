package dev.tastypommeslul.plonk.util;

public interface Ticks {

    static int fromSeconds(int seconds) {
        return seconds * 20;
    }
    static int fromMinutes(int minutes) {
        return fromSeconds(minutes * 60);
    }
    static int fromSeconds(double seconds) {
        return (int) (seconds * 20);
    }
    static int fromMinutes(double minutes) {
        return fromSeconds(minutes * 60);
    }
}
