package com.java.advancedmiting.advanced3;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();

        for (int i = 1; i <= 5; i++){
            list.add(new Double(i));
        }

        list.forEach(System.out::println);
    }
}




