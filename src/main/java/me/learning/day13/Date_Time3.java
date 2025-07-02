package me.learning.day13;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Date_Time3 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();
        Duration d1 = Duration.between(start, end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println("Duration between start and end: " + d1);
        System.out.println("1 millisecond duration: " + d2);


        System.out.println("-------------------------------------------------------------------------------------");

        ZonedDateTime now = ZonedDateTime.now();
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        // availableZoneIds.forEach(System.out::println); // Uncomment to print all zones

        ZonedDateTime newYorkTime = ZonedDateTime.of(
                2000, 12, 1, 14, 30, 30, 0,
                ZoneId.of("America/New_York")
        );
        System.out.println("New York Time (2000-12-01T14:30:30): " + newYorkTime);
    }
}
