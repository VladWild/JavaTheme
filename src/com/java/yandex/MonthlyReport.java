package com.java.yandex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonthlyReport {
    String[] contentFromOneLine;
    ArrayList<String> list = new ArrayList<>();
    HashMap<Object, Object> nameCategory = new HashMap<>();


    public void infoMonthlyReport() {
        for (int i = 0; i < 3; i++) {
            String s = readFileContentsOrNull("C:/projects/java-sprint2-hw/resources/m.20210" + (i + 1) + ".csv");
            String[] linesM = s.split(System.lineSeparator());
            for (int j = 1; j < linesM.length; j++) {
                String lineContentM = linesM[j];
                contentFromOneLine = lineContentM.split(",");
                list.add(contentFromOneLine[0]);
                list.add(contentFromOneLine[1]);
                list.add(contentFromOneLine[2]);
                list.add(contentFromOneLine[3]);
                nameCategory.put(j, list);
            }
        }

        Map<Integer, List<String>> nameCategory = new HashMap<>();
    }

    private String readFileContentsOrNull(String path) {

        return null;
    }
}