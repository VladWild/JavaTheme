package com.java.aattestation.collection;

import java.util.HashMap;
import java.util.Map;

public class MainHashMapTree {
    public static void main(String[] args) {

        Map<Key, Value> map = new HashMap<>();

        map.put(new Key(1), new Value("one"));
        map.put(new Key(2), new Value("two"));
        map.put(new Key(3), new Value("tree"));
        map.put(new Key(4), new Value("foor"));
        map.put(new Key(5), new Value("five"));
        map.put(new Key(6), new Value("six"));
        map.put(new Key(7), new Value("seven"));
        map.put(new Key(8), new Value("eight"));
        map.put(new Key(9), new Value("nine"));
        map.put(new Key(10), new Value("ten"));
        map.put(new Key(11), new Value("elevent"));

        map.entrySet().forEach(keyValueEntry ->
                System.out.println("Key = " + keyValueEntry.getKey() + "; Value = " + keyValueEntry.getValue()));


    }

    static class Key {
        int i;

        public Key(int i) {
            this.i = i;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return i == key.i;
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "i=" + i +
                    '}';
        }
    }

    static class Value {
        String j;

        public Value(String j) {
            this.j = j;
        }

        @Override
        public String toString() {
            return "Value{" +
                    "j='" + j + '\'' +
                    '}';
        }
    }
}
