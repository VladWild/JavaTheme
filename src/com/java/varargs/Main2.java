package com.java.varargs;

import java.util.Objects;

public class Main2 {
    public static void main(String[] args) {
        method(null, null);
        method(new Object());
        method(new Object[]{new Object(), new Object()});
        method( null);
    }

    public static void method(Object... objects){
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
