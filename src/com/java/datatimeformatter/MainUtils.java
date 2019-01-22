package com.java.datatimeformatter;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Stream;

public class MainUtils {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    private static final String TIME = "09:20";

    public static void main(String[] args) {
        Date date = new Date();
        Date newDate = getDateWithNewTime(TIME, date);
        System.out.println(newDate);
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {
        if (date == null) {
            return null;
        }
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static Date localDateTimeToDate(LocalDateTime date) {
        return Date.from(date.atZone(ZoneId.systemDefault()).toInstant());
    }

    private static Date getDateWithNewTime(final String TIME, Date date){
        LocalTime localTime = LocalTime.parse(TIME);
        LocalDateTime localDateTime2 = Optional.of(date)
                .map(MainUtils::dateToLocalDateTime).get()
                .withHour(localTime.getHour())
                .withMinute(localTime.getMinute())
                .withSecond(0)
                .withNano(0);
        return Optional.of(localDateTime2)
                .map(MainUtils::localDateTimeToDate)
                .get();
    }

    public static void variant1(){
        int[] ints = Stream.of(TIME.split(":")).mapToInt(Integer::parseInt).toArray();    //час и время
        Date date = new Date();                                                                 //какое-то время
        LocalDateTime localDateTime = dateToLocalDateTime(date);                                //date => localdatetime
        System.out.println(localDateTime);
        localDateTime = localDateTime.withHour(ints[0]).withMinute(ints[1]).withSecond(0).withNano(0);  //нужные часы и минуты в localdatetime
        System.out.println(localDateTime);
        Date newDate = localDateTimeToDate(localDateTime);                                      //localdatetime => date
        System.out.println(newDate);
        System.out.println();
    }

    public static void variant2(){
        Date date2 = new Date();
        int[] ints2 = Stream.of(TIME.split(":")).mapToInt(Integer::parseInt).toArray();
        LocalDateTime localDateTime2 = Optional.of(date2)
                .map(MainUtils::dateToLocalDateTime).get()
                .withHour(ints2[0])
                .withMinute(ints2[1])
                .withSecond(0)
                .withNano(0);
        date2 = Optional.of(localDateTime2).map(MainUtils::localDateTimeToDate).get();
        System.out.println(date2);
    }

    private static void StringToLocalDateTime(){
        LocalTime localTime = LocalTime.parse(TIME);
        System.out.println(localTime);
    }
}
