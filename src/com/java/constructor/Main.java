package com.java.constructor;

        import java.util.ArrayList;
        import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(1);
    }
}

class MyClass {
    MyObject object;

    {
        object = new MyObject();
    }

    //конструктор 1
    public MyClass(){
        System.out.println("конструктор 1");
    }

    //конструктор 2
    public MyClass(int k){
        this();
        System.out.println("конструктор 2");
    }
}

class MyObject{
    MyObject(){
        System.out.println("Объект типа MyObject инициализирован");
    }
}



