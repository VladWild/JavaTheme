package com.java.array_ssylka_ili_znachenie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        Arrays.stream(array).forEach(System.out::println);
        System.out.println();
        changeArray(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void changeArray(int[] array){
        array[2] = 32434;
    }
}
