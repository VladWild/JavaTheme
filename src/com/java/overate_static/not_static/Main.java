package com.java.overate_static.not_static;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        a = b;

        a.hello();

        //A ab = new B();
        //ab.hello();
    }
}

class A{
    public void hello(){
        System.out.println("Hello in A class");
    }
}

class B extends A{
    @Override
    public void hello(){
        System.out.println("Hello in B class");
    }
    
    public void newHello(){
        System.out.println("New hello!!!");
    }
}

