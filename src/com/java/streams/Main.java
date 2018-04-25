package com.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.stream().filter(Objects::nonNull);
    }
}
