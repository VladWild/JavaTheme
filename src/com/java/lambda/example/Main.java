package com.java.lambda.example;

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

