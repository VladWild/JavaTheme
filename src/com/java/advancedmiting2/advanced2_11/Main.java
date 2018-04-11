package com.java.advancedmiting2.advanced2_11;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException,
            NoSuchFieldException {
        WithPrivateFinalField pf = new WithPrivateFinalField();
        System.out.println(pf);

        Field f = pf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        f.setInt(pf, 47);
        System.out.println(pf);

        f = pf.getClass().getDeclaredField("s");
        f.setAccessible(true);
        f.set(pf, "MODIFY S");
        System.out.println(pf);


        f = pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        f.set(pf, "MODIFY S2");
        System.out.println(pf);
    }
}

class WithPrivateFinalField
{
    private int i = 1;
    private final String s  = "String S";
    private       String s2 = "String S2";

    public String toString() {
        return "i = " + i + ", s = " + s + ", s2 = " + s2;
    }
}



