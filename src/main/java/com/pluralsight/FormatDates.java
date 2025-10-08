package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now();
        ZonedDateTime gmtDateTime = currentZonedDateTime.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println("Date Formats\n========================");
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")));
        System.out.println(gmtDateTime.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm '(in GMT)'")));
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy '(in local time zone)'")));

    }
}
