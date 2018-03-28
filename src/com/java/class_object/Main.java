package com.java.class_object;

import java.util.Set;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        A a = new A();
        a.setName("Name1");

        System.out.println(a.getName());
        change(a);
        System.out.println(a.getName());

        System.out.println(cos(PI));
    }

    public static void change(A a) throws CloneNotSupportedException {
        a = (A) a.clone();
        a.setName("Name2");
        System.out.println(a.getName());
    }
}

class A implements Cloneable{
    String name;
    int number;

    A(){};

    public A(String name, int number) {
        this.name = name;
        this.number = number;
    }

    void hello(){
        System.out.println("hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (number != a.number) return false;
        return name != null ? name.equals(a.name) : a.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class B{
    int i;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        B b = (B) o;

        return i == b.i;
    }

    @Override
    public int hashCode() {
        return i;
    }
}






