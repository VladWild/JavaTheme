package com.java.executeservice;

import java.util.concurrent.*;

public class Main {

    public static ExecutorService executorService;
    public static Future<String> future;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("Старт потока " + Thread.currentThread().getName());
        executorService = Executors.newSingleThreadExecutor();
        future = executorService.submit(new MyCallable());
        System.out.println("Вывод после submit'а");
        System.out.println(future.isDone());
        Thread.sleep(1000);
        System.out.println(future.isDone());
        Thread.sleep(2000);
        System.out.println(future.isDone());
        System.out.println(future.get());
        System.out.println("Окончание потока " + Thread.currentThread().getName());
    }

    static class MyCallable implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(100);
            System.out.println("   Старт потока " + Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("   Окончание потока " + Thread.currentThread().getName());
            return "результат";
        }
    }
}
