package com.java.aattestation;

public class Main5 {

    public static void main(String[] args) {
        Exception ex = twoExceptionsMethod();
        System.out.println(ex.getClass());
    }

    public static Exception twoExceptionsMethod() {
        try {
            return new IndexOutOfBoundsException();
        } finally {
            return new NullPointerException();
        }
    }
}

