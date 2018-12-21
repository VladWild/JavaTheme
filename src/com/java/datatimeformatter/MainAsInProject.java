package com.java.datatimeformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainAsInProject {
    private static final String PATTERN = "dd.MM.yyyy";

    //непотокобезопасный
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(PATTERN);
    //потокобезопасный
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(PATTERN);

    private static final String DATE_STR = "01.01.2015";

    public static void main(String[] args) throws ParseException {
        System.out.println("1) Преобразование СТРОКИ в ДАТУ по паттерну - " + PATTERN);

        Date date1 = DATE_FORMAT.parse(DATE_STR);

        Date date2 = Utils.localDateToDate(LocalDate.parse(DATE_STR, DATE_TIME_FORMATTER));

        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date1.equals(date2));

        System.out.println("------------------------------------------");

        System.out.println("2) Преобразование ДАТЫ в СТРОКУ по паттерну - " + PATTERN);

        String date1Str = DATE_FORMAT.format(date1);
        String date2Str = DATE_TIME_FORMATTER.format(Utils.dateToLocalDate(date2));

        System.out.println(date1Str);
        System.out.println(date2Str);

        System.out.println(date1Str.equals(date2Str));
    }
}

class Utils{
    static Date localDateToDate(LocalDate date) {
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    static LocalDate dateToLocalDate(Date date) {
        if (date == null) {
            return null;
        }
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }
}

