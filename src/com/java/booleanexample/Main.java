package com.java.booleanexample;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Boolean bool = null;

        Boolean result = Optional.ofNullable(bool).orElse(false);
        //Boolean result =  BooleanUtils.isTrue(bool);

        System.out.println(result);
    }
}
