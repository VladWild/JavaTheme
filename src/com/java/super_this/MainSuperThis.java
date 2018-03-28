package com.java.super_this;

public class MainSuperThis {
    public static void main(String[] args) {

    }
}


class A{
    public int value;

    A(int value){
        this.value = value;
    }

    protected void metodA(){};

}

class B extends A{
    String name;

    B(int value) {
        super(value);
    }



    public void metod(){
        super.value = 1;
        super.metodA();
    }

}