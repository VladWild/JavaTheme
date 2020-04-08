package com.java.aattestation;

import java.util.Date;

public class MainImmutableObjects {

    public static void main(String[] args) {
        Student max = new Student(18, "Max", new Date(913454523334L));
        System.out.println(max);

        int age = max.getAge();
        age = 20;
        String name = max.getName();
        name = "Jack";
        Date birthDate = max.getBirthDate();
        birthDate.setTime(0L);

        System.out.println(max);

        new Object();
    }
}

final class Student {
    private final int age;
    private final String name;
    private final Date birthDate;

    public Student(int age, String name, Date birthDate) {
        this.age = age;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return (Date) birthDate.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

