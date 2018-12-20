package com.java.datatimeformatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class MainAsInProject {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private static final String DATE_STR = "01.01.2015";

    public static void main(String[] args) throws ParseException {
        Date date1 = DATE_FORMAT.parse(DATE_STR);

        Date date2 = Utils.localDateToDate(LocalDate.parse(DATE_STR, DATE_TIME_FORMATTER));

        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date1.equals(date2));
    }

}

class Utils{
    static Date localDateToDate(LocalDate date) {
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
}

