package com.java.advanced;

import java.util.*;

class Person implements Comparable<Person>{
    int age;

    Person(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<Integer,Person> persons =
                new TreeMap<Integer,Person>(Collections.reverseOrder());
        persons.put(2, new Person(6));
        persons.put(4, new Person(8));
        persons.put(5, new Person(2));
        persons.put(1, new Person(4));
        persons.put(3, new Person(10));

        for (Map.Entry person : persons.entrySet()) {
            System.out.println(person);
        }

    }
}

/*
class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
*/


