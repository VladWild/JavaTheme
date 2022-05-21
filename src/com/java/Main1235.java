package com.java;

public class Main1235 {
    private static int counter1 = 0;
    private static int counter2 = 0;

    public static void main(String[] args) throws InterruptedException {
        int tasksCount = 300000;
        //CountDownLatch latch = new CountDownLatch(tasksCount);
        //ExecutorService executor = Executors.newFixedThreadPool(100);
        for (int i = 0; i < tasksCount; i++) {
            new Thread(() -> {
                counter1++;
                counter2++;
                //latch.countDown();
            }).start();
        }

        //latch.await();
        Thread.sleep(1000);

        System.out.println(counter1);
        System.out.println(counter2);
        System.exit(0);
    }
}
