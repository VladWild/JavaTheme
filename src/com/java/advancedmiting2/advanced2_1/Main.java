package com.java.advancedmiting2.advanced2_1;

public class Main {
    public static void main(String[] args) {
        Gen<Object> gen = new Gen<>();
        Gen<Integer> gen2 = new Gen<>();

        System.out.println(gen instanceof Gen);
        System.out.println(gen2 instanceof Gen);
    }
}

class Gen<T> { }




