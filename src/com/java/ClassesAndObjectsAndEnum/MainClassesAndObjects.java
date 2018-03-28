package com.java.ClassesAndObjectsAndEnum;

public class MainClassesAndObjects {
    public static void main(String[] args) {
        //B object = new B();
        //A a = new A();

        //object.metod4();
        //a.metod4();

        D d = D.UP;

        System.out.println(d.getDescription());

    }
}

enum D implements K{
    UP {
        @Override
        public String getDescription() {
            return "Yeah, we going to up!!!";
        }
    }, DOWN(-10) {
        @Override
        public String getDescription() {
            return "No, we going to down (";
        }
    };
    private int heigth;
    D(){
        heigth = 0;
    }
    D(int heigth){
        this.heigth = heigth;
    }
    public int getHeigth(){
        return heigth;
    }
}

interface K{
    String getDescription();
}

class A{
    A(){
        this(0);
    };

    A(int k){

    }

    final void metod(){}
    void metod2(){
        System.out.println("Метод из класса A");
    }
    static void metod4(){
        System.out.println("Статический метод из класса A");
    };
}

class B extends A{
    @Override
    void metod2() {
        System.out.println("Метод из класса B");
    }

    void metod5(){};

    static void metod4(){
        System.out.println("Статический метод из класса В");
    };

}