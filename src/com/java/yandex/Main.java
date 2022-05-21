package com.java.yandex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();

        ForkJoinPool forkJoinPool = new ForkJoinPool();

        Collection<Callable<?>> tasks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            tasks.add(() -> {
                System.out.println("старт таски в потоке " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            });
        }

       /* for (int i = 0; i < 5; i++) {
            forkJoinPool.submit(tasks.get(i));
        }*/

        /*Collection<MyClass> myClasses = Arrays.asList(new MyClass(), new MyClass(), new MyClass(), new MyClass(), new MyClass());
        List<Future<Object>> futures = forkJoinPool.invokeAll(myClasses);*/

        Collection<MyClass> myClasses = Arrays.asList(new MyClass(), new MyClass(), new MyClass(), new MyClass(), new MyClass());

        ArrayList<ForkJoinTask<Object>> objects = new ArrayList<>();

        for (MyClass myClass : myClasses) {
            ForkJoinTask<Object> submit = forkJoinPool.submit(myClass);
            objects.add(submit);
        }

        List<ForkJoinTask<Object>> forkJoinTasks = Arrays.asList(objects.get(0), objects.get(1), objects.get(2), objects.get(3), objects.get(4));

        forkJoinTasks.stream().map(o -> {
            try {
                return o.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            return null;
        }).forEach(System.out::println);

        System.out.println(System.currentTimeMillis() - start);
        forkJoinPool.shutdown();
    }

    static class MyClass implements Callable<Object> {

        @Override
        public Object call() throws Exception {
            System.out.println("старт таски в потоке " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
