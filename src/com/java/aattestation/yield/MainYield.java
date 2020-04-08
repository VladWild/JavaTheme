package com.java.aattestation.yield;

public class MainYield {

    private static boolean ready;
    private static int number;

    public static void main(String[] args) throws InterruptedException {
        new ReadThread().start();
        Thread.sleep(500);
        number = 42;
        ready = true;
    }

    public static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!ready) {
                System.out.println(number);
            }
        }
    }
}
