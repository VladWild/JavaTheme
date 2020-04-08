package com.java.aattestation;

public class LambdaApp {
    private int k = 10;

    public static void main(String[] args) {
        LambdaApp lambdaApp = new LambdaApp();
        lambdaApp.run();
    }

    public void run() {
        Runnable lambda = () -> System.out.println(this.k);
        lambda.run();

        Runnable anonim = new Runnable() {
            private int k = 9999;

            @Override
            public void run() {
                System.out.println(this.k);
            }
        };
        anonim.run();
    }
}