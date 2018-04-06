package com.java.advancedmiting2.advanced2_10;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static long time;

    public static void main(String[] args) {
        ExecutorService executorService =
                Executors.newFixedThreadPool(2);

        time = System.currentTimeMillis();

        for (int i = 0; i < 4; i++){
            executorService.submit(()-> {;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Поток " +
                        Thread.currentThread() +
                " отработал");
                System.out.println("Прошло " +
                        (System.currentTimeMillis() - time) +
                        " милисекунд");
            });
        }

        executorService.shutdown();
    }
}





