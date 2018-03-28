package com.java.interfaces_and_anotation;


@Service(
        level = 2,
        sqlRequest = "SELECT * FROM phonebook"
)
public class MainInterfaces {
    public static void main(String[] args) {


    }
}

@interface Service{
    int level() default  0;
    String sqlRequest() default "";
}

class B implements A{
    void b(){};

    @Override
    public void a(B object) {

    }
}

class C extends B implements A{
    void c(){};
}

interface A <T extends B>{
    void a(T object);
}

