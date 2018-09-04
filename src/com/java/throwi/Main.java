package com.java.throwi;

public class Main {
    public static void main(String[] args) {

        try {
            method();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("-----------");
            throw e;
        }



        int r = 1;

        /*try {
            method2();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Тут типа обработка пробросанного исключения");
        }*/
    }

    public static void method(){
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        throw arrayIndexOutOfBoundsException;
    }

    public static void method2() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[2];
        arr[10] = 1;
    }
}

class MyExeption extends RuntimeException{}