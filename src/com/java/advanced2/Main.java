package com.java.advanced2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        example.run();
    }
}

class Example{
    void run(){
        bar(new ArrayList<Animal>());
    }

    void bar(List<Animal> list){
        System.out.println("Что-то делаем с коллекцией");
    }
}

class Animal{}

class Dog extends Animal{}






