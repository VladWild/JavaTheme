package com.java.lambda_constructors;

public class Main {
    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
    }
}

class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

@FunctionalInterface
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}

