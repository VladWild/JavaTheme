package com.java.varargs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(sum(array));
    }

    public static int sum(int ... array){
        return Arrays.stream(array)
                .reduce(0, (accomulator, value) ->
                        accomulator + value);
    }
}

