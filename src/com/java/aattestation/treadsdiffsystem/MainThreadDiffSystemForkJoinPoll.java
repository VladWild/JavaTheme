package com.java.aattestation.treadsdiffsystem;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class MainThreadDiffSystemForkJoinPoll {

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();

        List<String> results = null;
        ForkJoinTask<String> submit1 = pool.submit(new System1());
        ForkJoinTask<String> submit2 = pool.submit(new System2());
        try {
            System.out.println(new Date().getSeconds());
            results = Arrays.asList(submit1.get(), submit2.get());
            System.out.println(new Date().getSeconds());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            pool.shutdown();
        }
        System.out.println("Результаты:");
        System.out.println(results);
    }

    static class System1 extends RecursiveTask<String> {

        @Override
        protected String compute() {
            try {
                System.out.println("Начало выполнения системы 1");
                Thread.sleep(5000); //5 сек
                System.out.println("Конец выполнения системы 1");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            return "Результат Системы 1";
        }
    }

    static class System2 extends RecursiveTask<String>{

        @Override
        protected String compute() {
            try {
                System.out.println("Начало выполнения системы 2");
                Thread.sleep(2000); //2 сек
                System.out.println(new Date().getSeconds());
                System.out.println("Конец выполнения системы 2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Результат Системы 2";
        }
    }
}


