package me.learning.day13;

import java.time.LocalDate;

public class Date_Time2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();  // Current date
        LocalDate customDate = LocalDate.of(1990, 1, 1); // 1st Jan 1990
        LocalDate yesterday = today.minusDays(1);
        LocalDate pastDate = today.minusMonths(2);

        System.out.println("Today: " + today);
        System.out.println("Custom Date: " + customDate);
        System.out.println("Yesterday: " + yesterday);
        System.out.println("Past Date (2 months ago): " + pastDate);

        // Get day, month, year from today
        int dayOfMonth = today.getDayOfMonth();
        int month = today.getMonthValue();
        int year = today.getYear();

        System.out.println("Day: " + dayOfMonth);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
    }
}
