package com.java.advancedmiting2.advanced2_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.iterableHairsOfDog();
    }

    void iterableHairsOfDog(){
        Dog iterableDog = new Dog();
        for (Object hair : iterableDog) {
            System.out.println(hair);
        }
    }
}

class Dog implements Iterable{
    private List<String> hair = new ArrayList<>(Arrays.asList("1", "2"));

    @Override
    public Iterator iterator() {
        return hair.iterator();
    }
}

