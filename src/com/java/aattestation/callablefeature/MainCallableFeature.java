package com.java.aattestation.callablefeature;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainCallableFeature {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread myThread = new MyThread();
        FutureTask futureTask = new FutureTask(myThread);
        futureTask.run();
        System.out.println(futureTask.get());
    }

    static class MyThread implements Callable<String> {
        @Override
        public String call() throws Exception {
            Thread.sleep(2000);
            return "Результат выполнения потока";
        }
    }
}
