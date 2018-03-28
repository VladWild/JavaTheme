package com.java.interfaces_and_anotation;

import java.lang.annotation.*;

public class MainAnotation {
    public static void main(String[] args) {
        Raiting raiting = new Raiting(16);

        Class<Raiting> raitingClass = Raiting.class;
        Range range = raitingClass.getAnnotation(Range.class);

        if ((raiting.getValue() >= range.min()) && (raiting.getValue() <= range.max())){
            System.out.println("Текущий рейтинг: " + raiting.getValue());
        } else {
            System.out.println("Ошибка рейтинга!!!!");
        }

    }
}

@Range(max = 10)
class Raiting{
    int value;

    public Raiting(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

@Target(ElementType.TYPE)               //для класса
@Retention(RetentionPolicy.RUNTIME)     //доступна во время выполнения через reflection
@interface Range {
    int min() default 0;
    int max();
}


