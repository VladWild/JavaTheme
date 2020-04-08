package com.java.aattestation;

import java.util.HashMap;

public class MainCountString {
    public static void main(String[] args) {

        HashMap<Object, Long> collect = "abcbcc".chars().mapToObj(String::valueOf).collect(HashMap::new, (m, c) -> {
            if (m.containsKey(c)) {
                m.put(c, ((Long) m.get(c)) + 1);
            } else {
                m.put(c, 1L);
            }
        }, HashMap::putAll);

        collect.forEach((key, value) -> System.out.println(key + " = " + value));

    }
}



