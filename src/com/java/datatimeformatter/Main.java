package com.java.datatimeformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private static final String strData = "01.01.2015";

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        date.setHours(9);
        date.setMinutes(20);

        System.out.println(date);
    }
}
