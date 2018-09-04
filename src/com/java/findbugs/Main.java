package com.java.findbugs;

public class Main {
    private static String myOtherVariable;

    public static void main(String[] args) {
        Boolean a = false;
        Integer b = 0;

        //System.out.println("comment out code");

        if(a){
            System.out.println("a is true");
        }

        if(b>=0){
            if (b<=5){
                if (b>= 3){
                    if(b==4){
                        System.out.println("b is equal to 4");
                    }
                }
            }
        }

        try{
            System.out.println(myOtherVariable);
            String my_variable = new String();

            if(args.length > 0){
                my_variable = args[0];
            }
            if (my_variable == "sonarqube") {
                System.out.println("I found sonarqube" + my_variable);
            }
            else if (my_variable != ""){
                System.out.println("empoty");
            }
            else
            {
                System.out.println("value");
            }
        } catch (Throwable t){
            t.printStackTrace();
        }
    }
}
