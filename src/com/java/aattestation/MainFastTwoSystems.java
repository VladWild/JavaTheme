package com.java.aattestation;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MainFastTwoSystems {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> stringFutureTask = new FutureTask<>(new S1());
        FutureTask<String> stringFutureTask1 = new FutureTask<>(new S2());

        System.out.println(new Date().getSeconds());
        new Thread(stringFutureTask).start();
        new Thread(stringFutureTask1).start();

        System.out.println(new Date().getSeconds());
        List<String> strings = Arrays.asList(stringFutureTask.get(), stringFutureTask1.get());
        System.out.println(new Date().getSeconds());
        System.out.println(strings);
    }
}

class S1 implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "Рез S1";
    }
}

class S2 implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(4000);
        return "Рез S2";
    }
}
