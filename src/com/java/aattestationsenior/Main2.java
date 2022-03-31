package com.java.aattestationsenior;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main2 {

    public static void main(String[] args) {

        Map<String, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());

        synchronizedMap.put("1", "value 1");
        String value1 = synchronizedMap.get("1");
        System.out.println(value1);

        Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("2", "value 2");
        String value2 = concurrentHashMap.get("2");
        System.out.println(value2);
    }
}
