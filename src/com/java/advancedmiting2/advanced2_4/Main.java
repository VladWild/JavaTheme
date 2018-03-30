package com.java.advancedmiting2.advanced2_4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Item> items = new HashSet<>();

        items.add(new Item());
        items.add(new Item());

        Iterator iterator = items.iterator();
        while (iterator.hasNext()){
            if (items != null) {
                iterator.next();
                iterator.remove();
            }
        }

        System.out.println(items.size());
    }
}

class Item{};

