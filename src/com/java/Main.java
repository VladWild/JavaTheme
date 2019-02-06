package com.java;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<A> list1 = Arrays.asList(new B(), new C(), new C(), new B());

        list1.stream().filter(a -> a instanceof C).map(a -> (C) a).forEach(System.out::println);
    }
}

abstract class A {

}

class B extends A{
    @Override
    public String toString() {
        return "B";
    }
}

class C extends A{
    @Override
    public String toString() {
        return "C";
    }
}

