package com.java.to_catch_error_exeption;

public class Main {
    public static void main(String[] args) {
        A[] a = new A[1000000];

        try {
            for (int i = 0; i < 1000000; i++) {
                a[i] = new A();
                System.out.println(i);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            System.out.println("Обработка исключения OutOfMemoryError");
        }
        
    }
}

class A{
    Object[] objects = new Object[1000];
    
    A(){
        for (Object object:objects) {
            object = new Object();
        }
    }
}





