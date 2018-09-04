package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Pattern p = Pattern.compile("[[A-Z]|[a-z]\\s]*\\n");
        //Pattern p = Pattern.compile("[[0-9]\\s]*\\n");
        //Pattern p = Pattern.compile("[[A-Z]|[a-z]\\s]*\\n{1}[[0-9]\\s]*\\n{1}");
        Pattern p = Pattern.compile("(\\d{4}\\s?){4}");
        Matcher m = p.matcher("Premium Mir \n" + "2220 4576 1337 9101\n");
        while(m.find()) {
            System.out.println("-" + m.group());
        }
    }
}
