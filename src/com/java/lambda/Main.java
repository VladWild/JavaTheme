package com.java.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Converter<String, Integer> stringToInteger = x -> Integer.valueOf(x);
        Converter<String, Double> stringToDouble = x -> Double.valueOf(x);
        Converter<Double, String> doubleToString = x -> String.valueOf(x);

        System.out.println(String.valueOf(stringToInteger.convert("10") + 10));
        System.out.println(String.valueOf(stringToDouble.convert("0.8") + 0.8d));
        System.out.println(String.valueOf("value = " + doubleToString.convert(0.8d)));
    }
}

@FunctionalInterface
interface Converter <T, E>{
    E convert(T value);
}

