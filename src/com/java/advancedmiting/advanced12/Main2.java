package com.java.advancedmiting.advanced12;

public class Main2 {

    static volatile int I = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100000; i++) {
            new Thread(Main2::incI).start();
        }

        Thread.sleep(16000);
        System.out.println(I);
    }

    public synchronized static void incI() {
        I++;
    }
}

