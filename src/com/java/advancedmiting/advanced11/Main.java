package com.java.advancedmiting.advanced11;

import java.util.*;

public class Main {
    static final int COUNT = 10000;
    static List list;

    public static void main(String[] args) {
        list = Collections.synchronizedList(new ArrayList());

        new Thread(Main::addList, "Поток, добавляющий элементы").start();
        new Thread(Main::getList, "Поток, получающий элементы").start();
    }

    public static void addList(){
        for (int i = 0; i < COUNT; i++) {
            list.add(new Object());
        }
        System.out.println("Добавлено " + list.size() + " элементов");
    }

    public static void getList(){
        synchronized (list) {
            for (Iterator i = list.iterator(); i.hasNext(); ) {
                System.out.println(i.next());
            }
            System.out.println("Цикл пройден по " + list.size() + " элементам");
        }
    }
}


