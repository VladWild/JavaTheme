package com.java.values_in_interface;

import static com.java.values_in_interface.A.COUNT;

public class Main {
    public static void main(String[] args) {

    }
}

interface A{
    int COUNT = 10;
}

interface B{
    int COUNT = 20;
}

class F implements A, B{
    public F(){

    }
}