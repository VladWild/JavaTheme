package com.java.aattestation.collection;

import java.util.*;

public class MainTreeSet {

    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(
                15, 0.75f, true) {{
            put(1, "obj1");
            put(15, "obj15");
            put(4, "obj4");
            put(38, "obj38");
        }};

        linkedHashMap.forEach((integer, s) -> System.out.println(integer + ", " + s));
        linkedHashMap.get(1);
        System.out.println();
        linkedHashMap.forEach((integer, s) -> System.out.println(integer + ", " + s));

        new HashMap<>();
        Collection c = new Vector();
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        Set s = new HashSet();
        Deque deque = new ArrayDeque();
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(new Object());

        HashSet g = new HashSet();
        g.add(new Object());

        Queue q = new ArrayDeque();
    }

    static class A implements Comparable {
        int i = 1;

        public A(int i) {
            this.i = i;
        }

        @Override
        public int compareTo(Object o) {
            return i - ((A) o).i;
        }

        @Override
        public String toString() {
            return "A{" +
                    "i=" + i +
                    '}';
        }
    }
}
