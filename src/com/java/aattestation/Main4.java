package com.java.aattestation;

public class Main4 {

    public static void main(String[] args) {
        System.out.println(method());
    }

    public static String method() {
        try {
            return "SomeString";
        } catch(Exception ex) {
            return "Catch message";
        } finally {
            return "Finally message";
        }
    }
}

