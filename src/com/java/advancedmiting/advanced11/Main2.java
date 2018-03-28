package com.java.advancedmiting.advanced11;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main2 {
    static final int COUNT = 10000;
    static List list;

    public static void main(String[] args) {
        list = new CopyOnWriteArrayList();

        new Thread(Main2::addList, "Поток, добавляющий элементы").start();
        new Thread(Main2::getList, "Поток, получающий элементы").start();
    }

    public static void addList() {
        for (int i = 0; i < COUNT; i++) {
            list.add(new Object());
        }
        System.out.println(list.size());
    }

    public static void getList() {
        for (Iterator i = list.iterator(); i.hasNext(); ) {
            System.out.println(i.next());
        }
        System.out.println(list.size());
    }
}



