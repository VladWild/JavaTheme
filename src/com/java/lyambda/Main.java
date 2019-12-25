package com.java.lyambda;

import java.util.Comparator;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        String first = "first";
        String second = "second";

        int compare = Integer.compare(first.length(), second.length());
        System.out.println(compare);

        Comparator<String> stringComparator = (String first2, String second2) -> Integer.compare(first2.length(), second2.length());
        int compare1 = stringComparator.compare(first, second);
        System.out.println(compare1);

        Comparator<String> stringComparator2 = (first2, second2) -> Integer.compare(first2.length(), second2.length());
        int compare2 = stringComparator2.compare(first, second);
        System.out.println(compare2);

        Comparator<String> stringComparator4 = Comparator.comparingInt(String::length);
        int compare4 = stringComparator4.compare(first, second);
        System.out.println(compare4);

        String print = print(() -> first);
        System.out.println(print);
    }

    private static <T> T print(Supplier<T> task) {
        System.out.println("Я в print");
        return task.get();
    }
}
