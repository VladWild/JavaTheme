package com.java.advancedmiting2.advanced2_7;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        ThreadB threadB = new ThreadB();
        threadB.start();
        synchronized (threadB) {
            System.out.println(ThreadB.total);
            System.out.println("Time: " + (System.currentTimeMillis() - start));
            threadB.wait(1900);
            System.out.println();
            System.out.println("Time: " + (System.currentTimeMillis() - start));
            System.out.println(ThreadB.total);
        }
    }
}

class ThreadB extends Thread {
    static int total;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            total += i;
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}













