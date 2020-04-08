package com.java.aattestation.heppensbefore;

public class MainHeppensBefore {

    volatile static int a = 0;
    volatile static int b = 0;

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                int r1 = a;
                b = 2;
                System.out.println("r1 = " + r1);
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                int r2 = b;
                a = 1;
                System.out.println("r2 = " + r2);
            }
        }.start();
        // r1 = 1; r2 = 2 - impossible
    }
}
