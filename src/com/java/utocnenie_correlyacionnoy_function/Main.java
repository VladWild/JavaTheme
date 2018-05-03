package com.java.utocnenie_correlyacionnoy_function;

public class Main {

    public static double[][] function = {
            {0.25, 0.6, 0.8, 0.7, 0.4, 0.1},
            {0.35, 0.8, 0.91, 0.7, 0.3, 0.1},
            {0.35, 1, 1.6, 0.5, 1.4, 0.2},
            {0.35, 0.7, 0.89, 0.75, 0.3, 0.1},
            {0.25, 0.6, 0.8, 0.7, 0.4, 0.1}
    };

    public static Info getInfo(MyPointInt point){
        Info info = new Info();

        //a0
        info.a0 = function[point.y][point.x];

        //a1
        for (int i = -1; i < 2; i++){
            info.a1 +=  function[point.y + i][point.x + 1] - function[point.y + i][point.x - 1];
            System.out.println(info.a1);
            System.out.println(function[point.y + i][point.x + 1]);
            System.out.println(function[point.y - i][point.x - 1]);
        }
        info.a1 /= 6d;

        //a2
        for (int j = -1; j < 2; j++){
            info.a2 +=  function[point.y + 1][point.x + j] - function[point.y - 1][point.x + j];
        }
        info.a2 /= 6d;

        //a3
        double sum = 0d;
        for (int i = -1; i < 2; i++){
            sum +=  function[point.y + i][point.x + 1] + function[point.y + i][point.x - 1];
        }
        double sum2 = 0d;
        for (int j = -1; j < 2; j++){
            sum2 +=  function[point.y + 1][point.x + j] + function[point.y - 1][point.x + j];
        }
        info.a3 = (3d * sum - 2d * sum2) / 10d;

        //a4
        double sum3 = 0d;
        for (int j = -1; j < 2; j++){
            sum3 +=  function[point.y + 1][point.x + j] + function[point.y - 1][point.x + j];
        }
        double sum4 = 0d;
        for (int i = -1; i < 2; i++){
            sum4 +=  function[point.y + i][point.x + 1] + function[point.y + i][point.x - 1];
        }
        info.a4 = (3d * sum4 - 2d * sum3) / 10d;

        //a5
        info.a5 = function[point.y + 1][point.x + 1] + function[point.y - 1][point.x - 1] +
                function[point.y + 1][point.x - 1] + function[point.y - 1][point.x + 1];
        info.a5 /= 4d;

        return info;
    }

    public static void main(String[] args) {
        MyPointInt pointInt = new MyPointInt();
        MyPointSubpixel myPointSubpixel = new MyPointSubpixel();

        double max = 0d;

        for (int i = 0; i < function.length; i++){
            for (int j = 0; j < function[0].length; j++){
                if (function[i][j] > max){
                    pointInt.x = j;
                    pointInt.y = i;
                    max = function[i][j];
                }
            }
        }

        System.out.println(pointInt);
        System.out.println(max);

        Info info = getInfo(pointInt);

        System.out.println(info);

        myPointSubpixel.x = (info.a2 * info.a5 - 2 * info.a1 * info.a4) / (4 * info.a3 * info.a4 - info.a5 * info.a5);
        myPointSubpixel.y = (info.a1 * info.a5 - 2 * info.a2 * info.a3) / (4 * info.a3 * info.a4 - info.a5 * info.a5);

        System.out.println(myPointSubpixel);
    }

    private static class Info{
        double a0;
        double a1;
        double a2;
        double a3;
        double a4;
        double a5;

        @Override
        public String toString() {
            return "Info{" +
                    "a0=" + a0 +
                    ", a1=" + a1 +
                    ", a2=" + a2 +
                    ", a3=" + a3 +
                    ", a4=" + a4 +
                    ", a5=" + a5 +
                    '}';
        }
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

