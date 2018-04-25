package com.java.framework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String FIELD_ROW_REGEXP = "\\{(\\|X\\|| - )+\\}";
    private static final String OCCUPIED_CELL_REGEXP = "\\|X\\|";
    private static final String EMPTY_CELL_REGEXP = " - ";

    final String regex = String.format("%s%s%s", OCCUPIED_CELL_REGEXP, "|",
            EMPTY_CELL_REGEXP);

    public static void main(String[] args) {
        System.out.println(FIELD_ROW_REGEXP);
        System.out.println(OCCUPIED_CELL_REGEXP);
        System.out.println(EMPTY_CELL_REGEXP);

        Pattern pattern = Pattern.compile(FIELD_ROW_REGEXP);
        Matcher matcher = pattern.matcher("xewxewxewx");
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

        System.out.println(pattern);
    }
}
