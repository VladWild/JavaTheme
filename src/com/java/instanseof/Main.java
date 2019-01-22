package com.java.instanseof;

public class Main {
    public static void main(String[] args) {
        Approvement approvement = new ActivityApprovement();
        if (approvement instanceof ActivityApprovement){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        Approvement approvement2 = new Approvement();
    }

    static void method(ActivityApprovement activityApprovement){

    }

    static class Approvement{

    }

    static class ActivityApprovement extends Approvement{

    }
}
