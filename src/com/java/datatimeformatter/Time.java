package com.java.datatimeformatter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormat = new SimpleDateFormat();

        java.sql.Date date = new java.sql.Date(1235656267814L);
        java.sql.Time time = new java.sql.Time(435435454L);

        System.out.println(date);

        Clock.systemDefaultZone();

        TemporalAccessor temporalAccessor = null;

        Instant instant = Instant.now();
        System.out.println(instant);

        Date.from(Instant.now());

        System.out.println(new Date());
        System.out.println(Date.from(Instant.now()));

        System.out.println(LocalDateTime.now());
    }
}
