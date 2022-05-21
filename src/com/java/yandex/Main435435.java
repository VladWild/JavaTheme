package com.java.yandex;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main435435 {

    public static void main(String[] args) {


        IntStream.range(0, 5).parallel().forEach(i -> {
            System.out.println("Номер " + 1 + " поток " + Thread.currentThread().getName());
        });


        ArrayList<Integer> objects = new ArrayList<>();
        objects.add(1);
        objects.add(2);
        objects.add(3);
        objects.add(4);
        objects.add(5);

        objects.parallelStream().forEach(i -> {
            System.out.println("Номер " + 1 + " поток " + Thread.currentThread().getName());
        });
    }


}
