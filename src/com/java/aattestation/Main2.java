package com.java.aattestation;

public class Main2 {

    public static void main(String[] args) {
        int[] m = {1, 2};
        System.out.println(m[0] + " " + m[1]);
        bar(m);
        System.out.println(m[0] + " " + m[1]);
    }

    private static void bar(int[] m) {
        m[0] = 4324234;
    }
}

