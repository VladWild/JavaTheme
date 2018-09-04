package com.java.constI;

public class Main {

    private int i = 2;

    public static void main(String[] args) {
        final Main main = new Main();
        System.out.println(main.getI());
        main.setI(7);
        System.out.println(main.getI());
    }

    void setI(int i){
        this.i = i;
    }

    int getI(){
        return i;
    }
}
