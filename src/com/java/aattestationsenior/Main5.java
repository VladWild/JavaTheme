package com.java.aattestationsenior;

public class Main5 {

    public static void main(String[] args) {
        PersonKeeper keeper = new PersonKeeper();
        new Thread(keeper::getInstance).start();
        new Thread(keeper::getInstance).start();
    }
}

class PersonKeeper {
    private volatile Person person = null;

    public Person getInstance() {
        if (person == null) {
            synchronized (this) {
                if (person == null) {
                    person = new Person();
                }
            }
        }
        return person;
    }
}

class Person {
    private int age;
    private String name;

    public Person() {
        this.age = 25;
        this.name = "Oleg";
    }
}

