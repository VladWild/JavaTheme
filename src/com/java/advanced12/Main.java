package com.java.advanced12;

public class Main {
    static volatile int I = 0;

    public static void main(String[] args) {
        new Thread(Main::writeI, "ThreadWriteI").start();
        new Thread(Main::readI, "ThreadReadI").start();
    }

    public static void writeI() {
        while (I < 5){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("increment of I is " + (++I));
        }
    }

    public static void readI(){
        int localValue = I;
        while (localValue < 5){
            if (localValue != I){
                System.out.println("value of localValue is " + localValue);
                localValue = I;
            }
        }
    }
}



