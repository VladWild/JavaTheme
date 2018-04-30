package com.java.streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add(null);
        list.add("three");
        list.add("four");
        list.add(null);
        list.add(null);
        list.add("seven");
        list.add(null);

        System.out.println(list);
        System.out.println("----------------------------");

        //примеры фильтров (также есть findAny(), findFirst())
        list.stream().filter(Objects::nonNull).forEach(System.out::println);
        System.out.println("----------------------------");

        list.stream().filter("four"::equals).forEach(System.out::println);
        System.out.println("----------------------------");

        //list -> set
        Set<String> strings = list.stream().collect(Collectors.toSet());
        System.out.println(strings);
        System.out.println("----------------------------");

        //превращаем из одного объекта в другой такого же типа / еще peek()
        List<String> list2 = list.stream().filter(Objects::nonNull).map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list2);
        System.out.println("----------------------------");

        //делаем из нескольких листов один
        List<String> list3 = Stream.of(Arrays.asList("one", "three"), Arrays.asList("four", "seven"))
                .flatMap(str -> str.stream().map(String::toUpperCase)).collect(Collectors.toList());
        System.out.println(list3);
        System.out.println("----------------------------");

        //при этом min и max возвращают Optional - надстройку над объектом, у которой есть метод get()
        //максимальное значение (сравнение строк по количеству символов)
        String max = list.stream().filter(Objects::nonNull).max(((o1, o2) -> o1.length() - o2.length())).get();
        System.out.println(max);
        System.out.println("----------------------------");

        //минимальное значение (сравнение строк по количеству символов)
        String min = list.stream().filter(Objects::nonNull).max(((o1, o2) -> o2.length() - o1.length())).get();
        System.out.println(min);
        System.out.println("----------------------------");

        //аккомулирование allStr из всех элементов строки (начальное значение = "")
        String allStr = list.stream().filter(Objects::nonNull)
                .reduce("", (accomulator, element) -> accomulator + element + " ");
        System.out.println(allStr);
        System.out.println("----------------------------");

        //сотировка
        //по умолчанию
        List<String> list4 = list.stream().filter(Objects::nonNull)
                .sorted().collect(Collectors.toList());
        System.out.println(list4);
        System.out.println("----------------------------");
        //с компоратором
        List<String> list5 = list.stream().filter(Objects::nonNull)
                .sorted(((o1, o2) -> o2.length() - o1.length()))
                .collect(Collectors.toList());
        System.out.println(list5);
        System.out.println("----------------------------");

        //получить определенное количество значений - 5 штук
        List<String> list6 = list.stream().limit(5).collect(Collectors.toList());
        System.out.println(list6);
        System.out.println("----------------------------");

        //получить уникальные значения
        List<String> list7 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list7);
        System.out.println("----------------------------");

        //начать с 6-го значения
        List<String> list8 = list.stream().skip(5).collect(Collectors.toList());
        System.out.println(list8);
        System.out.println("----------------------------");

        //также есть
        //mapToInt()
        //mapToFloat()
        //и прочее
    }
}

