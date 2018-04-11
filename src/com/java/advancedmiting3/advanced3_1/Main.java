package com.java.advancedmiting3.advanced3_1;

public class Main {
    private final static int COUNT = 5;
    public static long time0;

    public static void main(String[] args) throws InterruptedException {
        ResourceA resourceA = new ResourceA();

        time0 = System.currentTimeMillis();

        for (int i = 0; i < COUNT; i++){
            Thread.sleep(100);
            new Thread(() -> {
                try {
                    resourceA.output();    //вывод времени в другом потоке
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}

class ResourceA{
    synchronized void output() throws InterruptedException {
        this.wait(1000);    //освобождает монитор, и через каждые 100 мс
                                    //позволяет другим потокам войти в метод

        Thread.sleep(1000);   //не отпускает монитор, а значит объект
                                    //захвачен монитором до окончания метода
        System.out.println("Time = " + (System.currentTimeMillis() - Main.time0));
    }
}


