package com.java.throwi;

import java.util.Objects;
import java.util.concurrent.Callable;

public class Main2 {
    public static void main(String[] args) {
        int k = 3;

        Callable<Object> callable = new Callable<Object>() {
            public Object call() throws Exception {
                int k1 = k;
                return null;
            };
        };

        Runnable o = () -> System.out.println(String.valueOf(k) + " frefref");
        o.run();

        A a = new A(){
            @Override
            public void k() {
                int l = k;
            }
        };


    }
}

interface A{
    void k();
}

