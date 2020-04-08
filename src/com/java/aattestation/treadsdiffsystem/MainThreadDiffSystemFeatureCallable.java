package com.java.aattestation.treadsdiffsystem;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainThreadDiffSystemFeatureCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System1 system1 = new System1();
        System2 system2 = new System2();

        FutureTask<String> ft1 = new FutureTask<>(system1);
        FutureTask<String> ft2 = new FutureTask<>(system2);
        System.out.println(new Date().getSeconds());
        new Thread(ft1).start();
        new Thread(ft2).start();

        System.out.println(new Date().getSeconds());
        List<String> results = Arrays.asList(ft1.get(), ft2.get());
        System.out.println(new Date().getSeconds());
        System.out.println(results);
    }

    static class System1 implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(5000); //5s
            return "Результат системы 1";
        }
    }

    static class System2 implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(2000); //2s
            return "Результат системы 2";
        }
    }
}

