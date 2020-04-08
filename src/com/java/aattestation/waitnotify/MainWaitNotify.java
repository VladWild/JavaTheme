package com.java.aattestation.waitnotify;

import java.util.Date;

public class MainWaitNotify {
    public static void main(String[] args) {
        System.out.println(new Date());
        MyThread myThread = new MyThread();
        myThread.start();
        int k = myThread.getK();
        System.out.println(k);
        System.out.println(new Date());
    }

    public static class MyThread extends Thread{
        private int k = 0;

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            k = 68686;
            synchronized (this) {
                System.out.println("synchronized notify()");
                notify();
                System.out.println("end synchronized notify()");
            }
        }

        public synchronized int getK() {
            System.out.println("synchronized wait()");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end synchronized wait()");
            return k;
        }
    }
}
