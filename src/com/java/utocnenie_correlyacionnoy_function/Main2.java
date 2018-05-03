package com.java.utocnenie_correlyacionnoy_function;

public class Main2 {

    public static double[][] function = {
            {0.25, 0.6, 0.8, 0.7, 0.4, 0.1},
            {0.35, 0.8, 0.91, 0.7, 0.3, 0.1},
            {0.35, 1, 1.1, 1.4, 1.39, 0.2},
            {0.35, 0.7, 0.89, 0.75, 0.3, 0.1},
            {0.25, 0.6, 0.8, 0.7, 0.4, 0.1}
    };

    public static void main(String[] args) {
        MyPointInt point = new MyPointInt();
        MyPointSubpixel myPointSubpixel = new MyPointSubpixel();

        double max = 0d;

        for (int i = 0; i < function.length; i++){
            for (int j = 0; j < function[0].length; j++){
                if (function[i][j] > max){
                    point.x = j;
                    point.y = i;
                    max = function[i][j];
                }
            }
        }

        System.out.println(point);

        double a0 = max;

        double a1x = 0.5d * (function[point.y][point.x + 1] - function[point.y][point.x - 1]);

        System.out.println("0.5 * (function[point.y][point.x + 1] - function[point.y][point.x - 1]) = " +
                "0.5" + " * (" + function[point.y][point.x + 1] + " - " + function[point.y][point.x - 1] + ") = " + a1x);

        double a2x = 0.5d * (function[point.y][point.x + 1] + function[point.y][point.x - 1]);

        System.out.println("0.5 * (function[point.y][point.x + 1] + function[point.y][point.x - 1]) = " +
                "0.5" + " * (" + function[point.y][point.x + 1] + " + " + function[point.y][point.x - 1] + ") = " + a2x);

        myPointSubpixel.x = (0.5d) * (a1x / a2x);

        System.out.println(myPointSubpixel);

    }

    private static class MyPointInt{
        int x = 0;
        int y = 0;

        @Override
        public String toString() {
            return "MyPointInt{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    private static class MyPointSubpixel{
        double x = 0d;
        double y = 0d;

        @Override
        public String toString() {
            return "MyPointSubpixel{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
