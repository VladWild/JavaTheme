package com.java.synchronizedI;

public class Main {
    public static Integer i = 0;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 1000; i++){
            new Thread(Main::method).start();
        }

        Thread.sleep(1000);

        System.out.println(i);
    }

    public static void method(){
        synchronized (i){
            i++;
        }
    }
}

