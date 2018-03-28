package com.java.defuilt_static_metods_interface.defuilt_metods;

public class MainDefailMetodsInInterface{
    public static void main(String[] args) {
        A a = new C();
        a.metod();
    }
}

interface A{
    default void metod(){
        System.out.println("interface A");
    }
}

interface B{
    default void metod(){
        System.out.println("interface B");
    }
}

class C implements A, B {
    @Override
    public void metod() {
        System.out.println("class C");
    }
}




