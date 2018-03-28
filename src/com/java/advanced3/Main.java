package com.java.advanced3;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= 5; i++){
            list.add(i);
        }

        list.forEach(integer -> System.out.println(integer));

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        list.forEach(System.out::println);

    }
}



