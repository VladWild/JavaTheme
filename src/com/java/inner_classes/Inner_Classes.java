package com.java.inner_classes;

public class Inner_Classes {
    public static void main(String[] args) {
        Ship ship = new Ship();
        ship.init();
        System.out.println("------");

        Ship.Engine obj = new Ship().new Engine();
        obj.allInit();
        obj.engBig();
        System.out.println("------");

        Motor motor = new Motor(ship);
        motor.launch();
        motor.allInit();
        motor.engBig();
        motor.init();
        motor.nameInMotor();
        System.out.println("------");

        class A {

        }
    }
}

class Ship {       // поля и конструкторы
    private Engine eng;       // abstract, final, private, protected - допустимы
    public class Engine extends EngineBig implements A { // определение внутреннего (inner) класса
        public Engine(){

        }
        // поля и методы
        public void launch() {
            System.out.println("Запуск двигателя");
        }

        @Override
        public void allInit() {
            System.out.print("Ship.this.init(): "); Ship.this.init();
            System.out.print("init(): "); init();
        }
    } // конец объявления внутреннего класса
    public final void init() { //  метод внешнего класса
        System.out.println("int Engine in Ship's metod");
        eng = new Engine();
        eng.launch();
    }
    public void name(){
        System.out.println(getClass().getName());
    };
    public static void k(){
        //Engine engine = new Engine();
    }
}

interface A {
    void allInit();
}

class EngineBig{
    public void engBig(){
        System.out.println("большой двигатель");
    }
    public final void init(){
        System.out.println("int Engine in EngineBig's metod");
    }
}

class Motor extends Ship.Engine{
    Ship ship;

    public Motor(Ship obj){
        obj.super();
        ship = obj;
    }
    public void nameInMotor(){
        ship.name();
    };
}