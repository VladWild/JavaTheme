package com.java.nullshow;

public class Main {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Integer integer){
        System.out.println("Integer");
    }

    public static void method(int i){
        System.out.println("int");
    }
}
