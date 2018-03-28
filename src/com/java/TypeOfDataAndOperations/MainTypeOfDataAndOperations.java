package com.java.TypeOfDataAndOperations;

public class MainTypeOfDataAndOperations {
    public static void main(String[] args) {
        A arrayA[] = {new A(1), new A(2)};

        for (A a:arrayA) {
            System.out.println(a.toString());
        }

        arrayA[1] = new A(3);

        for (A a:arrayA) {
            System.out.println(a.toString());
        }

        int l = arrayA.length;

    }

    private static void break2(){
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Перед оператором break.");
                    if (t) {
                        break second; // выход из блока second
                    }
                    System.out.println("Данный оператор никогда не выполнится");
                }
                System.out.println("Данный оператор никогда не выполнится ");
            }
            System.out.println("Данный оператор размещен после блока second.");
        }
    }

    private static void return2(){
        System.out.println("Перед оператором return.");
        if (true) return; // возврат в вызывающую программу
        System.out.println("Этот оператор никогда не выполнится.");
    }

    private static void literals(){
        int k = 7_000;

        Integer integer = new Integer(0);

        Integer integer2 = 88888;

        int l = integer;

        int p = 1;
        int o = 2;

        System.out.println(p==o);
    }

}

class A{
    int nuber;

    public A(int nuber) {
        this.nuber = nuber;
    }

    @Override
    public String toString() {
        return "A{" +
                "nuber=" + nuber +
                '}';
    }

    public void hello(){
        System.out.println(nuber);
    }
}


