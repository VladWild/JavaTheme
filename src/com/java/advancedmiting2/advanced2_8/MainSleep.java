package com.java.advancedmiting2.advanced2_8;

public class MainSleep {
    public static void main(String[] args)
            throws InterruptedException {
        ThreadA threadA = new ThreadA();
        threadA.start();

        Thread.sleep(10);

        System.out.println(threadA.getState());
    }
}

class ThreadA extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("---------------");
            ThreadA.sleep(100);
            System.out.println("---------------");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

