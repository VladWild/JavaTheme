package com.java.hiding_static_metod;

public class MainYHadingStaticMetod {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.testMethod();
        animal.staticMethod();

        Animal.staticMethod();
        Cat.staticMethod();
    }
}


class Animal {
    public static void staticMethod() {
        System.out.println("The static method in Animal");
    }
    public void testMethod() {
        System.out.println("The test (not static) method in Animal");
    }
}

class Cat extends Animal {
    //@Override - error
    public static void staticMethod() {
        System.out.println("The static method in Cat");
    }
    @Override
    public void testMethod() {
        System.out.println("The test (not static) method in Cat");
    }
}

