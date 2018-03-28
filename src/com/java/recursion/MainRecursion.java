package com.java.recursion;

public class MainRecursion {
    public static void main(String[] args) {
        int k = 12;

        System.out.printf("Get factorial k = " + k + ": " + factorial(k) + " " + fact(k));
    }

    public static int factorial(int k){
        int result;

        if ((k == 1) || (k == 0)){
            return 1;
        }

        result = factorial(k - 1) * k;
        return result;
    }

    public static int fact(int k){
        if (k == 1) return 1;
        return k * fact(k - 1);
    }
}
