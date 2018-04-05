package com.java.advancedmiting2.advanced2_8;

public class MainWait {
    public static void main(String[] args)
            throws InterruptedException {
        ThreadB threadB = new ThreadB();
        threadB.start();

        synchronized (threadB){
            System.out.println("----------------");
            threadB.wait();
            System.out.println("----------------");
        }
    }
}

class ThreadB extends Thread{
    @Override
    public void run() {
        synchronized (this){
            System.out.println(getState());
            notify();
        }
    }
}

