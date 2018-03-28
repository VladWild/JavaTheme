package com.java.initialisation_object;

import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //get object Class of class B
        Class<?> bClass = B.class;

        //created list of all annotations in class B
        List<D> listOfAnnotations = new LinkedList<D>();

        //annotation before class B
        if(bClass.isAnnotationPresent(D.class)) {
            listOfAnnotations.add(bClass.getAnnotation(D.class));
        }

        //all annotations before constructors of class B
        Constructor[] allConstructorsOfClassB = bClass.getConstructors();
        for (Constructor constructor:allConstructorsOfClassB) {
            if(constructor.isAnnotationPresent(D.class)) {
                listOfAnnotations.add((D) constructor.getAnnotation(D.class));
            }
        }

        //all annotations before methods of class B
        Method[] allMethodsOfClassB = bClass.getMethods();
        for (Method method:allMethodsOfClassB) {
            if(method.isAnnotationPresent(D.class)) {
                listOfAnnotations.add(method.getAnnotation(D.class));
            }
        }

        //all annotations before fields of class B
        Field[] allFieldsOfClassB = bClass.getFields();
        for (Field field:allFieldsOfClassB) {
            if(field.isAnnotationPresent(D.class)) {
                listOfAnnotations.add(field.getAnnotation(D.class));
            }
        }

        //output informations of all anotations in class B
        for (D annotation:listOfAnnotations) {
            System.out.println(annotation.name());
        }

        Annotation annotation = new Annotation() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return null;
            }
        };

        //System.out.println(annotation.getClass());

        System.out.println("\nCount of annotations: " + listOfAnnotations.size());
    }
}



