package com.java.initialisation_object;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

@D(name = "before class B")
public class B {@D(name = "before static field class B")
public static String s = "Hello";

    @D(name = "before non-static field class B")
    public int a = 1;

    @D(name = "before constructor class B")
    public B() {
        super();
        a = 2;
    }

    public int c = 3;

    {
        a=11;
        c=33;
    }

    @D(name = "before public method class B")
    public void methodPublic(){}

    @D(name = "before method toString class B")
    @Override
    public String toString() {
        return "B{" + "a=" + a + ", c=" + c + '}';
    }

}

