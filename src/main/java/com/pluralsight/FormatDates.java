package com.pluralsight;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        ZonedDateTime currentDateTime = ZonedDateTime.now();
        ZonedDateTime gmtDateTime = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println("Date Formats\n===================");
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")));
        System.out.println(gmtDateTime.format(DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mm")));
        System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy")));

    }
}
