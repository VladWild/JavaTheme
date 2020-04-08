package com.java.aattestation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));

        int k = 0;

        List<Object> objects = Collections.unmodifiableList(new ArrayList<>());
        //objects.add(new Object());

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList list2 = list;
        list2.add(123.4);
        Object a = list.get(0);
        System.out.println(a.getClass().getName());

        new A();
    }

    static class A {
        static {
            Object o = new Object();
            o = null;
            o.hashCode();
        }
    }

    private static int factorial(int i) {
        if (i == 1) return i;
        return factorial(i - 1) * i;
    }

}
