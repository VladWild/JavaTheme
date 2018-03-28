package com.java.parametr_classes;

public class Main {
    public static void main(String[] args) {
        Exam<Double> md1 = new Exam<Double>(71.41D,"Progr");// 71.5d
        Exam<Double> md2 = new Exam<Double>(71.45D, "Progr");// 71.5d
        System.out.println(md1.equalsToMark(md2));
        Exam<Integer> mi = new Exam<Integer>(71,"Progr");
        md1.equalsToMark(mi);
    }
}

class Exam<T extends Number> {
    private String name;
    private T mark; // параметр поля

    public Exam(T mark, String name) { // параметр конструктора
        this.name = name;
        this.mark = mark;
    }

    public T getMark() { // параметр метода
        return mark;
    }

    private int roundMark() {
        return Math.round(mark.floatValue()); // метод класса Number
    }

    public boolean equalsToMark(Exam<?> ob) { // параметр метода
        return roundMark() == ob.roundMark();
    }
}



