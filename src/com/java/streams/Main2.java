package com.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Integer [][] matrixB = {
                {-9,1,0},
                {4,1,1},
                {-2,2,-1}
        };

        List<Integer> list =
                Arrays.stream(matrixB).map(Arrays::asList)
                        .flatMap(line -> line.stream()).collect(Collectors.toList());
        System.out.println(list);

        Integer [] array =
                Arrays.stream(matrixB)
                        .flatMap(Arrays::stream).toArray(Integer[]::new);

        for (Integer elem : array) {
            System.out.println(elem);
        }

    }
}

