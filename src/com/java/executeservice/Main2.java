package com.java.executeservice;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        MyCallable myCallable = new MyCallable();
        RunnableFuture<String> future = new FutureTask<>(myCallable);
        Thread thread = new Thread(future);
        thread.start();
        Thread.sleep(100);
        System.out.println(future.isDone());
        Thread.sleep(1000);
        System.out.println(future.isDone());
        Thread.sleep(4000);
        System.out.println(future.isDone());
        System.out.println("Окончание потока " + Thread.currentThread().getName());
    }

    public static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(200);
            System.out.println("   Старт потока " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("   Окончание потока " + Thread.currentThread().getName());
            return "результат";
        }
    }
}
