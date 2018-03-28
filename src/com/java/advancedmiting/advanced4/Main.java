package com.java.advancedmiting.advanced4;

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
        Iterator iterableDog = new Dog().getIterator();
        while (iterableDog.hasNext()) {
            System.out.println(iterableDog.next());
        }
    }
}

class Dog {
    private List<String> hair = new ArrayList<>(Arrays.asList("1", "2"));

    Iterator getIterator(){
        return hair.iterator();
    }
}

