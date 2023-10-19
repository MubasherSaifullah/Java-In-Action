package mushi.main.runner.java16;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DayPeriodSupport {
    public static void main(String[] args) {
        // Create a local time object.
        LocalTime timeMorning = LocalTime.parse("06:25:08.690791");
        LocalTime timeAfternoon = LocalTime.parse("15:25:08.690791");
        LocalTime timeEvening = LocalTime.parse("18:25:08.690791");
        LocalTime timeNight = LocalTime.parse("23:25:08.690791");

        // Format the time using the day period support.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h B");

        // Print the formatted time.
        System.out.println(timeMorning.format(formatter));
        System.out.println(timeAfternoon.format(formatter));
        System.out.println(timeEvening.format(formatter));
        System.out.println(timeNight.format(formatter));
    }
}
