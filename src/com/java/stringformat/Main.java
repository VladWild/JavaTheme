package com.java.stringformat;

import java.util.regex.Pattern;

public class Main {
    private final static String ENTER = "%n";
    private final static String ENTER2 = "\n";

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("text");
        stringBuilder.append(String.format(ENTER));
        //stringBuilder.append(ENTER2);
        stringBuilder.append("text2");

        System.out.println(stringBuilder.toString());

        System.out.println("-------------------------------");

        final String regex = //
        "text(?s).\\ntext2";
        //"text\\ntext2";

        System.out.println(regex);
        System.out.println("-------------------------------");

        System.out.println(Pattern.compile(regex)
                .matcher(stringBuilder.toString()).find());

        System.out.print(String.format("%n").toCharArray()[0]);
        System.out.print(String.format("%n"));
        System.out.println("-------------------------------");
    }
}

