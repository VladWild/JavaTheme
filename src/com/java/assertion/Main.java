package com.java.assertion;

public class Main {
    public static void main(String[] args) {
        new Main().age(-5);
    }

    private void age(int a){
        assert (a >= 0) : new NegativeAge();
        //do something with age
        System.out.println(a);
    }
}

class NegativeAge extends RuntimeException{

}




