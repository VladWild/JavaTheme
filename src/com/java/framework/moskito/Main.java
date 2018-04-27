package com.java.framework.moskito;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Iterator<String> mis = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };

    }
}
