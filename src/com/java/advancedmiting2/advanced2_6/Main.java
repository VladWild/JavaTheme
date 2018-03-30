package com.java.advancedmiting2.advanced2_6;

import javax.management.monitor.Monitor;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        };

        new Thread().start();
    }
}

class A {
    static void method() {
        synchronized (A.class) {
            System.out.println("do something");
        }
    }
}





