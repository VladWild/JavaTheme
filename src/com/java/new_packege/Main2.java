package com.java.new_packege;

public class Main2 {

    public static void main(String[] args) {
        Parrent parrent = null;
        try {
            parrent = new Parrent();
        } catch (Throwable e) {
            System.out.println(e);
        }

        System.out.println(parrent);

    }
}

class Parrent {
    Integer age;

    public Parrent() {
        age = 28;
        throw new NullPointerException();
    }


}
