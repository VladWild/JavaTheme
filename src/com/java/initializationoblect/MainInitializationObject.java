package com.java.initializationoblect;

public class MainInitializationObject {
    public static void main(String[] args) {
        Child child = new Child();

    }
}

class Parrent{
    static final String CLASS_NAME = "Parrent";
    static final String STATIC_BLOCK_CLASS_NAME;
    int value = 1;

    static {
        STATIC_BLOCK_CLASS_NAME = "Parrent in static block";
    }

    {
        value = 10;
    }

    Parrent(){
        value = 100;
    }
}




class Child extends Parrent{
    static final String CLASS_NAME = "Child";
    int numberChild;

    static {
        System.out.println("4) Static block initialisation class Child");
    }

    {
        System.out.println("9) Non-static block initialisation class Child");
    }

    Child(){
        System.out.println("10) Non-static block initialisation class Child");
    }

}







