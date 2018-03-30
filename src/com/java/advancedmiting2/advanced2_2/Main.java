package com.java.advancedmiting2.advanced2_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i < 6; i++){
            list.add(i);
        }

        for (int i = 0; i < 5; i++){
            System.out.println(list.get(i));
        }

    }
}

