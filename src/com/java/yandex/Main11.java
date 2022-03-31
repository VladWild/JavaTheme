package com.java.yandex;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        int[][] stepsByDay = new int[2][6]; //тут типа сделал пока 6 мес по 2 дня
        Scanner scanner = new Scanner(System.in);

        int summMonth = 0;
        for (int i = 0; i < stepsByDay.length; i++) { //12 - мес
            for (int j = 0; j < stepsByDay[i].length; j++) { //30 - дни
                System.out.println("день = " + (i + 1) + " месяц = " + (j + 1));
                int monthShow = scanner.nextInt();
                summMonth += monthShow;
            }
            System.out.println("Общее количество шагов " + summMonth);
        }
    }
}
