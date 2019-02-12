package com.java.mapvaluetolist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, A> map = new HashMap<>();
        map.put("1", new A(1));
        map.put("2", new A(2));
        map.put("3", new A(2));

        //Map<String, A> -> List<A> (size - 3)

        List<A> listA = new ArrayList<>(map.values());
        listA.forEach(System.out::println);
    }
}

class A{
    int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "i=" + i +
                '}';
    }
}