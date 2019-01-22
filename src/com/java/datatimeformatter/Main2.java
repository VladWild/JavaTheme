package com.java.datatimeformatter;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main2 {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:MM");
    private static final String TIME = "14:00";

    public static void main(String[] args) {
        Date date = localDateTimeToDate(LocalDateTime.parse(TIME, DATE_TIME_FORMATTER));
        System.out.println(date);
    }

    public static Date localDateTimeToDate(LocalDateTime date) {
        return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
    }
}
