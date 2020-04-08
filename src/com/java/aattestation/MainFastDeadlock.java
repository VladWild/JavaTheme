package com.java.aattestation;

public class MainFastDeadlock {

    public static void main(String[] args) {
        ResA resA = new ResA();
        ResB resB = new ResB();

        resA.b = resB;
        resB.a = resA;

        new Thread(resA::mA1).start();
        new Thread(resB::mB1).start();
    }

}

class ResA {
    ResB b;

    public synchronized void mA1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.mB2();
    }

    public synchronized void mA2() {
        System.out.println("Я не вызовусь!!!");
    }
}

class ResB{
    ResA a;

    public synchronized void mB1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.mA2();
    }

    public synchronized void mB2() {
        System.out.println("Я не вызовусь!!!");
    }
}