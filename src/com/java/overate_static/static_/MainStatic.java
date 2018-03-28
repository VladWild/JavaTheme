package com.java.overate_static.static_;

public class MainStatic {
    public static void main(String[] args) {
        B b = null;
        A a = null;
        a = b;

        a.hello();
    }
}

class A{
    public static void hello(){
        System.out.println("Hello in A class");
    }
}

class B extends A {
    public static void hello(){
        System.out.println("Hello in B class");
    }
}
