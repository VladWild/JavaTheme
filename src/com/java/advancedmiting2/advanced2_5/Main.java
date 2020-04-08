package com.java.advancedmiting2.advanced2_5;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();

        new Thread() {
            @Override
            public void run() {
                try {
                    a.method();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        Thread.sleep(2000);

        new Thread() {
            @Override
            public void run() {
                a.method2();
            }
        }.start();
    }
}

class A {
    synchronized void method() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Synchronized method end work");
    }

    void method2() {
        System.out.println("Non-synchronized method");
    }
}

