package com.java.miltuthread;

public class Main {

    public static int v1 = 0;
    public static boolean v2 = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());

        t1.start();
        t2.start();

        System.out.println("dscdscdsc");
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            v1 = 20;
            v2 = true;
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            int i = 1;
            while (!v2){
                System.out.println("Итерация цикта: " + i++);
            }
            System.out.println(v1);
            System.out.println(v2);
        }
    }


}
