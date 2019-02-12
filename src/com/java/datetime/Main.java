package com.java.datetime;

import java.time.*;
import java.util.Date;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.now();
        System.out.println(startDate);

        Date plannedStartDate = new Date(1111111423411l);
        System.out.println(plannedStartDate);

        LocalTime plannedStartDate2 = Utils.dateToLocalTime(plannedStartDate);

        LocalDateTime localDateTime = LocalDateTime.of(startDate, plannedStartDate2);
        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = Optional.ofNullable(plannedStartDate)
                .map(Utils::dateToLocalTime)
                .map(localTime -> LocalDateTime.of(startDate, localTime))
                .orElse(null);

        System.out.println(localDateTime2);
    }
}

class Utils{
    public static LocalDateTime dateToLocalDateTime(Date date) {
        if (date == null) {
            return null;
        }
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static LocalTime dateToLocalTime(Date date) {
        if (date == null) {
            return null;
        }
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalTime();
    }
}