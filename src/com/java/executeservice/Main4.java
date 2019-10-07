package com.java.executeservice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main4 {
    public static void main(String[] args) {
        List dates = IntStream.range(0, -2).mapToObj(f -> f).collect(Collectors.toList());

        System.out.println(dates.isEmpty());
    }
}
