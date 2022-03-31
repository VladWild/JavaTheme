package com.java.aattestationsenior;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main6 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executors.newFixedThreadPool(2);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> submit = executorService.submit(() -> {
            Thread.sleep(1000);
            return "dscdscdsc";
        });

        ExecutorService executorService1 = Executors.newCachedThreadPool();

        System.out.println(submit.get());
        ExecutorService executorService2 = Executors.newWorkStealingPool();
        executorService2.submit(() -> "sdcdscdscdsc");
    }
}
