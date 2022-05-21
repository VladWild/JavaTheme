package com.java.yandex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main454 {

    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.values().stream().collect(Collectors.toList());

        cats.add(new Cat("Мукзик"));
        cats.add(new Cat("Марсик"));
        cats.add(new Cat("Варя"));

        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext()) {
            Cat next = iterator.next();
            if ("Марсик".equals(next.getName())) {
                cats.remove(next);
            }
        }

        System.out.println(cats);
    }

    static class Cat {
        private String name;

        Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
