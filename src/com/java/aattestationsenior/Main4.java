package com.java.aattestationsenior;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main4 {
    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put(1, "Sergey");
        concurrentHashMap.put(2, "Olya");
        concurrentHashMap.put(3, "Vasya");
        concurrentHashMap.put(4, "Petr");
        concurrentHashMap.put(5, "Maxim");

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = concurrentHashMap.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Integer key = iterator.next();
                System.out.println(key + " = " + concurrentHashMap.get(key));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            concurrentHashMap.put(6, "Andrey");
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(concurrentHashMap);
    }
}



