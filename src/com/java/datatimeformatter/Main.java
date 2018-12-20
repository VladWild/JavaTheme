package com.java.datatimeformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private static final String strData = "01.01.2015";

    public static void main(String[] args) throws ParseException {
        Date date = DATE_FORMAT.parse(strData);
        System.out.println(date);

        LocalDate localDate = LocalDate.parse(strData, DATE_TIME_FORMATTER);
        Date date2 = java.sql.Date.valueOf(localDate);
        System.out.println(date2);

        System.out.println(date.equals(date2));
    }
}
