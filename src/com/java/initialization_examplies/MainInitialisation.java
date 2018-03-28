package com.java.initialization_examplies;

public class MainInitialisation {
    public static void main(String[] args) {

        //B.Test test = new B().new Test();

        //B b = new B(test);



    }
}


/*
class Test{
    class B {
        int a;
        int b;
        int c;
        final / synthetic / Test this$0;

        B(final Test this$0) {
            this.this$0 = this$0;
            //super();
            this.a = 1;
            this.c = 3;
            this.a = 11;
            this.b = 22;
            this.c = 33;
            this.b = 2;
        }
    }

}
*/

class InnerClassTest0 {

    public void foo() {
        new Inner1();
    }

    public class Inner1 {
        public Inner1() {
        }
    }
}

class Test{
    class B {
        int a;
        int b;
        int c;
        B(){
            this.a = 1;
            this.c = 3;
            this.a = 11;
            this.b = 22;
            this.c = 33;
            this.b = 2;
        }
    }

}


