package com.java.advancedmiting.advanced10;

public class Main {
    public static void main(String[] args) {
        ResourceA a = new ResourceA();
        ResourceB b = new ResourceB();

        a.b = b;    //ресурсу A даем ссылку на объект ресурса B
        b.a = a;    //ресурсу B даем ссылку на объект ресурса A

        new Thread(a::foo, "Поток-A").start();
        new Thread(b::bar, "Поток-B").start();
    }
}

class ResourceA{
    ResourceB b;

    public synchronized void foo(){
        System.out.println(Thread.currentThread().getName() + " вошел в метод ResourceA.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс ResourceA прерван");
        }

        System.out.println(Thread.currentThread().getName() + " пытается вызвать метод ResourceB.last()");
        b.last();
    }

    public synchronized void last(){
        System.out.println("Мы в методе ResourceA.last()");
    }
}

class ResourceB{
    ResourceA a;

    public synchronized void bar(){
        System.out.println(Thread.currentThread().getName() + " вошел в метод ResourceB.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс ResourceB прерван");
        }

        System.out.println(Thread.currentThread().getName() + " пытается вызвать метод ResourceA.last()");
        a.last();
    }

    public synchronized void last(){
        System.out.println("Мы в методе ResourceB.last()");
    }
}

