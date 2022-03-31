package com.java.threads.inc;

public class Main {
    static volatile int I = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 1_000_000; i++) {
            inc();
        }

        System.out.println(Main.I);
    }

    public static synchronized void inc() {
        Main.I++;
    }
}

