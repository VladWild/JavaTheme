package com.java.framework.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private final static String regex = ""//
            + "\\nEMERGENCY PREVENTION SYSTEM\\n-{80}\\n-{80}\\n"//
            + "Field's width is M = \\d+\\n"//
            + "Field's height is N = \\d+\\n{2}"//
            + "Entered ranks plank with following borders:\\n"//
            + "NoneRisk = \\d{1,10}-\\d{1,10};\\n"//
            + "MinorRisk = \\d{1,10}-\\d{1,10};\\n"//
            + "NormalRisk = \\d{1,10}-\\d{1,10};\\n"//
            + "MajorRisk = \\d{1,10}-\\d{1,10};\\n"//
            + "CriticalRisk = \\d{1,10}-\\d{1,10};\\n"//
            + "{2}-{80}\\n[ \\d\\n|X-]*"//
            + "Risk groups report:\\n-{80}\\n"//
            + "NoneRisk: \\d+ groups;\\n"//
            + "MinorRisk: \\d+ groups;\\n"//
            + "NormalRisk: \\d+ groups;\\n"//
            + "MajorRisk: \\d+ groups;\\n"//
            + "CriticalRisk: \\d+ groups;";

    private final static String regex2 = ""//
            + "\\nEMERGENCY PREVENTION SYSTEM\\n-{80}\\n-{80}\\n"
            + "Field's width is M = \\d+\\n";

    private final static String EPS = "EMERGENCY PREVENTION SYSTEM";
    private final static String ENTER = "\n";
    private final static int COUNT_TRAIT = 80;
    private final static String TRAIT = "-";

    public static void main(String[] args) {
        StringBuilder report = new StringBuilder();

        report.append(ENTER);
        report.append(EPS);
        report.append(ENTER);
        report.append(getCountSymbols(TRAIT, COUNT_TRAIT));
        report.append(ENTER);
        report.append(getCountSymbols(TRAIT, COUNT_TRAIT));
        report.append(ENTER);



        System.out.println(Pattern.compile(regex2)
                .matcher(report.toString()).find());
    }

    public static String getCountSymbols(String symbol, int count){
        StringBuilder symbols = new StringBuilder();

        for (int i = 0; i < count; i++){
            symbols.append(symbol);
        }

        return symbols.toString();
    }
}
