package com.java.aattestationsenior;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static int COUNT_ELEMENTS = 10_000_000;
    public static int COUNT_EXPERIMENTS = 10;

    public static List<Long> arrayListResult = new ArrayList<>();
    public static List<Long> linkedListResult = new ArrayList<>();
    public static List<Long> result = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < COUNT_EXPERIMENTS; i++) {
            long startArrayList = System.currentTimeMillis();
            List<Object> arrayList = new ArrayList<>();
            for (int j = 0; j < COUNT_ELEMENTS; j++) {
                arrayList.add(new Object());
            }
            long endArrayList = System.currentTimeMillis() - startArrayList;
            arrayListResult.add(endArrayList);

            long startLinkedList = System.currentTimeMillis();
            List<Object> linkedList = new LinkedList<>();
            for (int j = 0; j < COUNT_ELEMENTS; j++) {
                linkedList.add(new Object());
            }
            long endLinkedList = System.currentTimeMillis() - startLinkedList;
            linkedListResult.add(endLinkedList);
        }

        System.out.println("ArrayList: " + getResult(arrayListResult));
        System.out.println("LinkedList: " + getResult(linkedListResult));
        for (int i = 0; i < COUNT_EXPERIMENTS; i++) {
            result.add(linkedListResult.get(i) / arrayListResult.get(i));
        }
        System.out.println("Array faster Linked: " + getResult(result));
        System.out.println("Average: " + result.stream().map(String::valueOf).mapToInt(Integer::parseInt).average().getAsDouble());
    }

    private static String getResult(List<Long> list) {
        return list
                .stream()
                .map(String::valueOf)
                .reduce("", (accomulator, value) -> accomulator + " " + value);
    }
}






