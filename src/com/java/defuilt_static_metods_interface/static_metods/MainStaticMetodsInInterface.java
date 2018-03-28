package com.java.defuilt_static_metods_interface.static_metods;

public class MainStaticMetodsInInterface {
    public static void main(String[] args) {
        A b = new B();
        A.metod();
    }
}

interface A{
    static void metod(){
        System.out.println("interface A");
    }
}

class B implements A {

}

