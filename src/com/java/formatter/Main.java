package com.java.formatter;

import java.util.Arrays;

import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        System.out.println(format("%s", Arrays.toString(arr)));
    }
}
