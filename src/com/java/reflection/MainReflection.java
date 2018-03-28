package com.java.reflection;

import java.lang.reflect.Modifier;

public class MainReflection {
    public static void main(String[] args) {

        MyClass my = new MyClass("MyClass", 1);

        //Class myRef = my.getClass();
        Class myRef = MyClass.class;

        System.out.println("Name of class: " + myRef.getName());

        int mods = myRef.getModifiers();

        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }

        System.out.println(mods);

        Object o = new Object();



    }
}


final class MyClass{
    private String name;
    private int id;

    public MyClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

