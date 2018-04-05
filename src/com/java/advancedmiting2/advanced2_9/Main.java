package com.java.advancedmiting2.advanced2_9;

public class Main {
    public static void main(String[] args)
            throws InterruptedException {
        long start = System.currentTimeMillis();

        ThreadA threadA = new ThreadA();
        threadA.start();

        Thread.sleep(10);

        System.out.println("k = " + threadA.getK());
        System.out.println("Time: " +
                (System.currentTimeMillis() - start));
    }
}

class ThreadA extends Thread{
    private int k = 10;

    @Override
    public void run() {
        try {
            ThreadA.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized int getK(){
        return k;
    }
}






