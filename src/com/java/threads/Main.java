package com.java.threads;

//import java.util.concurrent.atomic;

public class Main {
    volatile double d;
    //synchronized int k;

    public static void main(String[] args) {
        Thread thread = new Thread();
        try {
            thread.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //ThreadGroup

    void k(){}
}

class A extends Thread{

}

class B implements Runnable{

    @Override
    public void run() {
        System.out.println("Method run in class B");
    }
}

