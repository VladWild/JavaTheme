package com.java.framework.annotationInject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

public class Main {
    int k;

    @Inject("Hello")
    int l;

    @Inject("I know")
    int o;

    public void run(){
        Field[] declaredFields = getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                String id = field.getAnnotation(Inject.class).value();
                System.out.println(id);
                /*
                Object objectForInjection = context.getEPSBean(id);
                field.setAccessible(true);
                try {
                    field.set("1", objectForInjection);
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
                */
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
    String value();
}

