package com.java.yandex;

public class Main10 {

    public static void main(String[] args) {
        int[] values = { 1, 1, 2, 3, 4};
        int valueToFind = 2;

        System.out.printf("Index = %d%n",
                binarySearch(values, valueToFind, 0, values.length - 1));
    }

    private static int binarySearch(int[] values, int valueToFind, int l, int r) {
        if (valueToFind == values[r]) {
            return r;
        }

        if (valueToFind == values[l]) {
            return l;
        }

        int m = (l + r) / 2;

        if (valueToFind <= values[m]) {
            return binarySearch(values, valueToFind, l, m);
        } else {
            return binarySearch(values, valueToFind, m, r);
        }
    }
}
