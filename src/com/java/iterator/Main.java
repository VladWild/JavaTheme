package com.java.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add(null);
        list.add("three");
        list.add("four");
        list.add(null);
        list.add(null);
        list.add("seven");
        list.add(null);

        Iterator listIter = list.iterator();
        while (listIter.hasNext()){
            System.out.println(listIter.next());
            list.remove(null);
        }
    }
}
