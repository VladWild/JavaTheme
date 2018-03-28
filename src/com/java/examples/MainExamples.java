package com.java.examples;

public class MainExamples {
    public static void main(String[] args) {
        MainExamples mainExamples = new MainExamples();
        mainExamples.foo();
    }

    void foo(){
        int m = 0;
        System.out.println(m);
        bar(m);
        System.out.println(m);
    }

    void bar(int m) {
        m++;
    }
}


