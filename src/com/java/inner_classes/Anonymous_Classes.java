package com.java.inner_classes;

public class Anonymous_Classes {
    public static void main(String[] args) {
        P p = new P();
        p.hello();

        P p2 = new P() {
            private final static String buy = "buy";
            public String k = "dsffsv";

            @Override
            void hello() {
                System.out.println("-----------------Hello!!!----------------------");
                buy();
            }

            public void buy(){
                System.out.println(buy);
            }

        };

        p2.hello();
        //p2.k;
    }
}

class P{
    void hello(){
        System.out.println("Hello!!!");
    }
}