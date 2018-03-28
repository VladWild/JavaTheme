package com.java.inner_classes;

public class Nested_Classes {
    public static void main(String[] args) {
        B.Ship ship = new B.Ship();

        ShipBig shipBig = new ShipBig();

        LifeBoatBig lifeBoatBig = new LifeBoatBig();
        lifeBoatBig.swim();

        ShipBig.LifeBoat lifeBoat = new ShipBig.LifeBoat();

    }
}

class ShipBig {
    private int id;
    // abstract, final, private, protected - допустимы
    public static class LifeBoat {
        private int boatId;
        public static void down() {
            System.out.println("шлюпки на воду!");
        }
        public void swim() {
            System.out.println("отплытие шлюпки");
        }

    }

    public int getIdInShipBig(){
        return id;
    }

    public void metod(){
        LifeBoat lifeBoat = new LifeBoat();
    }

    public static void k(){
        LifeBoat lifeBoat = new LifeBoat();
    }
}

class LifeBoatBig extends ShipBig.LifeBoat {
    public void l(){
        down();
        swim();
    }
}


interface B {
    static class Ship{

    }
}