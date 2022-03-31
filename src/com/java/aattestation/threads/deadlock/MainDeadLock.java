package com.java.aattestation.threads.deadlock;

import java.util.PriorityQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MainDeadLock {

    static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();

        a.b = b;    //ресурсу A даем ссылку на объект ресурса B
        b.a = a;    //ресурсу B даем ссылку на объект ресурса A

        CopyOnWriteArrayList<Object> objects = new CopyOnWriteArrayList<>();
        objects.iterator();
        new PriorityQueue();

        CompletableFuture<Object> completableFuture = new CompletableFuture<>();

        completableFuture
                .completeAsync(() -> "Вернули эту строку из другого потока")
                .thenAccept(str -> System.out.println(str))
                .thenRun(() -> System.out.println("Hello"));


        new Thread(a::foo, "Поток-A").start();
        new Thread(b::bar, "Поток-B").start();
    }

    static class ResourceA{
        ResourceB b;

        public synchronized void foo() {
            lock.lock();
            System.out.println(Thread.currentThread().getName() + " вошел в метод ResourceA.foo()");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Класс ResourceA прерван");
            }

            System.out.println(Thread.currentThread().getName() + " пытается вызвать метод ResourceB.last()");
            b.last();
            lock.unlock();
        }

        public synchronized void last(){
            System.out.println("Мы в методе ResourceA.last()");
        }
    }

    static class ResourceB{
        ResourceA a;

        public synchronized void bar(){
            while (true) {
                if (lock.tryLock()) {
                    System.out.println(Thread.currentThread().getName() + " вошел в метод ResourceB.foo()");

                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Класс ResourceB прерван");
                    }

                    System.out.println(Thread.currentThread().getName() + " пытается вызвать метод ResourceA.last()");
                    a.last();
                    lock.unlock();
                } else {
                    System.out.println("cdscdsc");
                }
            }
        }

        public synchronized void last(){
            System.out.println("Мы в методе ResourceB.last()");
        }
    }
}


