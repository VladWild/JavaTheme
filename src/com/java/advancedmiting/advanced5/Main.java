package com.java.advancedmiting.advanced5;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.foo();
    }

    void foo(){
        Integer i = 1;
        synchronized (i){
            i++;
        }
    }
}

