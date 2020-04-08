package com.java.aattestation;

public class MainFastDeadLock2 {

    public static void main(String[] args) {
        ResAA resAA = new ResAA();
        ResBB resBB = new ResBB();

        resAA.b = resBB;
        resBB.a = resAA;

        new Thread(resAA::m1).start();
        new Thread(resBB::m1).start();
    }
}

class ResAA{
    ResBB b;

    public synchronized void m1() {
        synchronized (b) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            b.m2();
        }
    }

    public synchronized void m2() {
        System.out.println("не зайду");
    }
}

class ResBB{
    ResAA a;

    public synchronized void m1() {
        synchronized (a) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a.m2();
        }
    }

    public synchronized void m2() {
        System.out.println("не зайду");
    }
}