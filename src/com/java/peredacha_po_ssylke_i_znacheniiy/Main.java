package com.java.peredacha_po_ssylke_i_znacheniiy;

public class Main {
    public static void main(String[] args) {

        int k = 6;
        Integer integerObj = new Integer(6);
        MyInteger myInteger = new MyInteger(6);

        changePrimitive(k);
        changeObject(integerObj);
        changeMyObject(myInteger);

        System.out.println("Primitive - " + k);
        System.out.println("Object - " + integerObj);
        System.out.println("My Object - " + myInteger.getValue());

    }

    public static void changePrimitive(int k){
        k = 10;
    }

    public static void changeObject(Integer integerObj){
        integerObj = new Integer(10);
    }

    public static void changeMyObject(MyInteger myInteger){
        myInteger.setValue(10);
    }

}

class MyInteger{
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}