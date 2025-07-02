package me.learning.day13;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_Time4 {
    public static void main(String[] args) {
        LocalDateTime localNow = LocalDateTime.now();
        LocalDateTime myDate = LocalDateTime.parse("2023-01-11T13:48");
        System.out.println("Current LocalDateTime: " + localNow);
        System.out.println("Parsed LocalDateTime: " + myDate);

        // 4. LocalTime comparisons
        LocalTime timeNow = LocalTime.now();
        LocalTime customTime = LocalTime.of(14, 30);
        LocalTime parsedTime = LocalTime.parse("15:30:45");
        LocalTime beforeOneHour = timeNow.minusHours(1);

        if (timeNow.isAfter(beforeOneHour)) {
            System.out.println("Han bhai");
        }

        System.out.println("Current LocalTime: " + timeNow);
        System.out.println("Custom Time: " + customTime);
        System.out.println("Parsed Time: " + parsedTime);
        System.out.println("One hour before now: " + beforeOneHour);
    }
}
