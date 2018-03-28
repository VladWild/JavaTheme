package com.java.string_enjoy_strok;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String s1 = "Hello ";
        String s2 = "World!!!!!";
        String s3 = s1 + s2;

        String s4 = "HELLO".concat(" WORLD").concat("!!!!!");

        new StringBuilder().append(s1).append(s2).toString();

    }
}


