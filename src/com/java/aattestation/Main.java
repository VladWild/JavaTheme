package com.java.aattestation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Я в try");
        } finally {
            System.out.println("Я в начале finally");
            Object o = null;
            o.hashCode();
            System.out.println("Я в конце finally");
        }
    }
}



