package me.learning.day13;

import java.time.LocalTime;

public class Date_Time {
    public static void main(String[] args) {
        // 1. LocalTime examples
        LocalTime now = LocalTime.now();  // Current time
        LocalTime customTime = LocalTime.of(14, 30); // 14:30 (2:30 PM)
        LocalTime parsedTime = LocalTime.parse("15:30:45"); // Parse from string

        System.out.println("Now: " + now);
        System.out.println("Custom Time: " + customTime);
        System.out.println("Parsed Time: " + parsedTime);

        // Get hour, minute, second from current time
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);

    }
}
