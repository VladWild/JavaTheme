package com.java.advancedmiting.advanced9;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();

        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);

        a.k();

        thread1.start();





    }
}

class A implements Runnable {
    @Override
    public void run() {
        k();
        System.out.println("Поток 1");
    }

    public synchronized void k(){
        System.out.println("Ждем");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Подождали");
    }
}

class B  implements Runnable{
    @Override
    public void run() {
        System.out.println("Поток 2");
    }
}