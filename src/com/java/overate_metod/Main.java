package com.java.overate_metod;

public class Main {
    public static void main(String[] args) {
        A a = new B();

        a.getCat().hello();
    }
}

class A{
    public Cat getCat(){
        System.out.println("getCat in class A");
        return new Cat();
    }
}

class B extends A{
    @Override
    public Kitten getCat() {
        System.out.println("getCat in class B");
        return new Kitten();
    }
}

class Cat{
    void hello(){
        System.out.println("I'm cat");
    }
}

class Kitten extends Cat{
    @Override
    void hello() {
        System.out.println("I'm kitten");
    }
}