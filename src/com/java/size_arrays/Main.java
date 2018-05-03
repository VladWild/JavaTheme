package com.java.size_arrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static int k[] = {};

    public static void main(String[] args) {
//        System.out.println(k.length);
//        k[0] = 9;
//        System.out.println(k.length);
//        k[1] = 4;
//        k[2] = 5;
//        System.out.println(k.length);

        List<String> stockList = new ArrayList<String>();
        stockList.add("stock1");
        stockList.add("stock2");

        String[] stockArr = stockList.toArray(new String[stockList.size()]);

        for (String str : stockArr) {
            System.out.println(str);
        }
    }
}
