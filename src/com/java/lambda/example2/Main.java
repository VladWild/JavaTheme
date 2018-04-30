package com.java.lambda.example2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.forEach(System.out::println);

        System.out.println(Integer.MAX_VALUE);
    }
}

interface A{

}

interface B{

}





